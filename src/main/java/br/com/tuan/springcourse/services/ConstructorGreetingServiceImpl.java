package br.com.tuan.springcourse.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {

		return "Hello Gurus - from the constructor";
	}

}
