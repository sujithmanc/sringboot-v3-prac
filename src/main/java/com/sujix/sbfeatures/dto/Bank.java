package com.sujix.sbfeatures.dto;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class Bank {
	private int acc;
	private double amount;
	private String bankName;
	
	public Bank() {
		super();
		Random r = new Random();
		acc = r.nextInt(1_000_000, 10_000_000);
		bankName="SBI";
		amount = 12342.334;
	}
}
