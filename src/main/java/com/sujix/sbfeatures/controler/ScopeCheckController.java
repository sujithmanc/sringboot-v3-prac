package com.sujix.sbfeatures.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujix.sbfeatures.dto.Cat;
import com.sujix.sbfeatures.dto.Emp;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, path = "/emp")
public class ScopeCheckController {
	
	@Autowired
 	private Emp emp;
	
	@Autowired
	private Cat cat;
	
	@GetMapping
	public Emp get() {
		emp.setName("Sujith");
		emp.setSalary(50_000);
		return emp;
	}
	
	@GetMapping("/inc")
	public String inc() {
		emp.setId(emp.getId() + 1);
		return "SUCCESS";
	}
	
	@GetMapping("/cat")
	public Cat cat() {
		return cat;
	}
}
