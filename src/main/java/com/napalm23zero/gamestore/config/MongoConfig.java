package com.napalm23zero.gamestore.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan("com.napalm23zero.gamestore.models")
@EnableMongoRepositories(basePackages = "com.napalm23zero.gamestore.repositories")
public class MongoConfig extends AbstractMongoConfiguration {

    private final String username;
    private final String password;
    private final String database;
    private final String host;
    private final Integer port;

    @Autowired
    public MongoConfig(@Value("${spring.datasource.mongo.username}") String username,
            @Value("${spring.datasource.mongo.password}") String password,
            @Value("${spring.datasource.mongo.database}") String database,
            @Value("${spring.datasource.mongo.host}") String host,
            @Value("${spring.datasource.mongo.port}") Integer port) {
        this.username = username;
        this.password = password;
        this.database = database;
        this.host = host;
        this.port = port;
    }

    @Override
    public MongoClient mongoClient() {
        MongoCredential mongoCredential = MongoCredential.createCredential(this.username, this.database,
                this.password.toCharArray());
        ServerAddress serverAddress = new ServerAddress(this.host, this.port);
        MongoClientOptions mongoClientOptions = MongoClientOptions.builder().applicationName("gamestore").build();
        return new MongoClient(serverAddress, mongoCredential, mongoClientOptions);
    }

    @Override
    protected String getDatabaseName() {
        return this.database;
    }

}
