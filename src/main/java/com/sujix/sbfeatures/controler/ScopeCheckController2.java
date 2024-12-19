package com.sujix.sbfeatures.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujix.sbfeatures.dto.Emp;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, path = "/emp2")
public class ScopeCheckController2 {
	
	@Autowired
 	private Emp emp;
	
	@GetMapping
	public Emp get() {
		
		return emp;
	}
	
}
