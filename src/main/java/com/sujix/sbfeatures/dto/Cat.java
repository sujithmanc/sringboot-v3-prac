package com.sujix.sbfeatures.dto;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Data
public class Cat {

	private int age;
	private String name;
	
	public Cat() {
		age = new Random().nextInt(1, 10);
	}
	
	
}
