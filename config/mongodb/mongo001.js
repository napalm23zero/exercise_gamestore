rs.initiate();
db = db.getSiblingDB('gamestore')
db.createUser(
    {
        user: 'spring-boot',
        pwd: 'xyz123',
        roles: [{ role: 'readWrite', db: 'gamestore' }]
    }
);