package br.com.foursys.api.service;

import java.util.List;

import br.com.foursys.api.model.User;

public interface UserService {

	List<User> findAll();
	User findById(Integer id);
}
