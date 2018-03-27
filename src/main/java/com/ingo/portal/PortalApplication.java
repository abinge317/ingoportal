package com.ingo.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@ServletComponentScan
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

	@RequestMapping("/list1.html")
	String news() { //新闻列表
		return "list1";
	}

	@RequestMapping("/view1-1.html")
	String news1() { //新闻列表
		return "view1-1";
	}
	@RequestMapping("/view1-2.html")
	String news2() { //新闻列表
		return "view1-2";
	}
	@RequestMapping("/view1-3.html")
	String news3() { //新闻列表
		return "view1-3";
	}
	@RequestMapping("/view1-4.html")
	String news4() { //新闻列表
		return "view1-4";
	}
	@RequestMapping("/view1-5.html")
	String news5() { //新闻列表
		return "view1-5";
	}
	@RequestMapping("/view1-6.html")
	String news6() { //新闻列表
		return "view1-6";
	}

	@RequestMapping("/message.html")
	String message() { //新闻列表
		return "message";
	}
}
