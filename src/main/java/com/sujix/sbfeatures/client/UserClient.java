package com.sujix.sbfeatures.client;

import org.springframework.web.service.annotation.GetExchange;

import com.sujix.sbfeatures.model.User;

import reactor.core.publisher.Flux;

public interface UserClient {

	@GetExchange
    Flux<User> getUsers();
	
}
