package br.com.foursys.api.service;

import java.util.List;

import br.com.foursys.api.dto.UserDTO;
import br.com.foursys.api.model.User;

public interface UserService {

	List<User> findAll();
	User findById(Integer id);
	User create(UserDTO obj);
	User update(UserDTO obj);
}
