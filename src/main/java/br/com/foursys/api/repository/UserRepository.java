package br.com.foursys.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.foursys.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
