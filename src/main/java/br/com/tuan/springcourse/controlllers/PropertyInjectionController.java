package br.com.tuan.springcourse.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.com.tuan.springcourse.services.GreetingService;

@Controller
public class PropertyInjectionController {

	@Autowired
	@Qualifier("propertyGreetingServiceImpl")
	public GreetingService service;

	public String greet() {

		String greet = this.service.greet();

		return greet;
	}
}
