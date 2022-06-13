package br.com.foursys.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.foursys.api.model.User;
import br.com.foursys.api.repository.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	UserRepository repository;
	
	@Bean
	public void startDb() {
		User u1 = new User(null, "Robson", "robson@gmail.com", "123");
		User u2 = new User(null, "Luiz", "luiz@gmail.com", "1234");
		User u3 = new User(null, "Diego", "diego@gmail.com", "1235");
		
		repository.saveAll(List.of(u1, u2, u3));
	}
}
