package br.com.tuan.springcourse.controlllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.com.tuan.springcourse.services.GreetingService;

@Controller
public class ConstructorInjectionController {

	private GreetingService service;	
	
	public ConstructorInjectionController(@Qualifier("constructorGreetingServiceImpl") GreetingService service) {
		
		this.service = service;
	}
	
	public String greet() {
		
		String greet = this.service.greet();
		
		return greet;
	}
}
