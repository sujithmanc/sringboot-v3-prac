package com.sujix.sbfeatures.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.resource.NoResourceFoundException;

import reactor.core.publisher.Mono;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NoResourceFoundException.class)
	public Mono<ResponseEntity<String>> handleNotFoundException(NoResourceFoundException ex) {
		return Mono.just(ResponseEntity.notFound().build());
	}
}