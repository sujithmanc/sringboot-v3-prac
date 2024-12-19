package com.sujix.sbfeatures.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "person.info")
public class DetailsConfig {
	private String name;
	private int age;
	
}
