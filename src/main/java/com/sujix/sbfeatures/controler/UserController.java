package com.sujix.sbfeatures.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.sujix.sbfeatures.client.UserClient;
import com.sujix.sbfeatures.model.Response;
import com.sujix.sbfeatures.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private WebClient userClient;
	
	@Autowired
	private UserClient client;

	@GetMapping("/v1")
	public Flux<User> getUsers() {
		return userClient.get().retrieve().bodyToFlux(User.class);
	}

	@GetMapping("/v2")
	public Mono<Response> getUsersV2() {
		
		return userClient.get().uri("/users").retrieve().bodyToFlux(User.class).collectList()
				.map(users -> new Response(200, Flux.fromIterable(users)))
				.onErrorResume(error -> Mono.just(new Response(404, Flux.empty())));
	}
	
	@GetMapping("/v3")
	public Flux<User> getUsersV3() {
		return client.getUsers();
	}

}
