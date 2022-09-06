package com.fstop.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserBo extends SpringBootServletInitializer {
	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(UserBo.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(UserBo.class, args);
	}
}

