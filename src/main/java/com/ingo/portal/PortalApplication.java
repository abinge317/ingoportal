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

	@RequestMapping(value={"/","index.html","index.htm"})
	String index() {
		return "index";
	}

	@RequestMapping("/list3.html")
	String products() {
		return "list3";
	}

	@RequestMapping("/list7.html")
	String cases() {
		return "list7";
	}

	@RequestMapping("/view2-1.html")
	String aboutus() {
		return "view2-1";
	}

	@RequestMapping("/list5.html")
	String list5() { //板岩青石板列表
		return "list5";
	}

	@RequestMapping("/view5-30.html")
	String view5_30() { //板岩青石板
		return "view5-30";
	}
}
