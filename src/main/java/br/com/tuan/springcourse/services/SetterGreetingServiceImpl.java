package br.com.tuan.springcourse.services;

import org.springframework.stereotype.Service;

@Service("setter")
public class SetterGreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		
		return "Hello Gurus - from the setter";
	}

}
