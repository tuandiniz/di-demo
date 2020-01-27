package br.com.tuan.springcourse.controlllers;

import org.springframework.stereotype.Controller;

import br.com.tuan.springcourse.services.GreetingService;

@Controller
public class MyController {

	private GreetingService service;

	public MyController(GreetingService injService) {

		this.service = injService;
	}

	public String hello() {
		return service.greet();
	}
}
