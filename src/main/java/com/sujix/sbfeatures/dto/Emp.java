package com.sujix.sbfeatures.dto;

import java.util.Random;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("singleton")
@Data
public class Emp {
	
	private long id;
	private String name;
	private double salary;
	
	private final Bank bank;
	

	public Emp( Bank bank) {
		super();
		this.bank = bank;
		Random r = new Random();
		id = r.nextInt(1, 101);
	}
	
	@Lookup
	public Bank getBank() {
		return bank;
	}
	
	

}
