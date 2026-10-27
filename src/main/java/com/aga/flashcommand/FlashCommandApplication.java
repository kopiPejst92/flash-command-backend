package com.aga.flashcommand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.aga.flashcommand"})
public class FlashCommandApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashCommandApplication.class, args);
	}
}

