
package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Console;
import com.napalm23zero.gamestore.repositories.ConsoleRepository;

public interface ConsoleService extends GenericService<Console, Long>, ConsoleRepository {

}