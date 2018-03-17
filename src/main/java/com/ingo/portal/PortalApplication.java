package com.ingo.portal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class PortalApplication {


	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}

	@RequestMapping("/")
	String index() {
		return "index";
	}
}
