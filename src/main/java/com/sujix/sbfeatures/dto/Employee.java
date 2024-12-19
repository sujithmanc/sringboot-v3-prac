package com.sujix.sbfeatures.dto;

import lombok.Builder;
import lombok.ToString;


@ToString
@Builder
public class Employee {
	private int id;
	private String name;
	private String username;
	private boolean gender;
}
