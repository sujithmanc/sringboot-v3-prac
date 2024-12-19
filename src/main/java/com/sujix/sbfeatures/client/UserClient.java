package com.sujix.sbfeatures.client;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;
import com.sujix.sbfeatures.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserClient {

	@GetExchange
	Flux<User> getUsers();

	@GetExchange("/{id}")
	Mono<User> getUserById(@PathVariable("id") int id);

	@PostExchange
	Mono<User> saveUser(@RequestBody User user);

	@PutExchange("/{id}")
	Mono<User> updateUser(@PathVariable("id") int id, @RequestBody User user);

	@DeleteExchange("/{id}")
	Mono<User> deleteUser(@PathVariable("id") int id);

	@PatchExchange("/{id}")
	Mono<User> patchUser(@PathVariable("id") int id, @RequestBody User user);
	
}
