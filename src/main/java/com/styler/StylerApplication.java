package com.styler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(StylerConfiguration.class)
public class StylerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StylerApplication.class, args);
	}
}
