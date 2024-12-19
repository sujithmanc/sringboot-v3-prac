package com.sujix.sbfeatures.config;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "employee")
@ToString
@AllArgsConstructor
@Getter
public final class DemoConfig {
	private final String name;
	private final int age;
	private final double salary;
	private final Set<String> pets;
	private final boolean active;	
	private final Set<Acc> accounts;
}
