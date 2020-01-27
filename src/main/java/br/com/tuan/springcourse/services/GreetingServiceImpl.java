package br.com.tuan.springcourse.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({ "en", "default" })
public class GreetingServiceImpl implements GreetingService {

	public static final String GREETING_MSG = "Hello Gurus!!";

	@Override
	public String greet() {

		return GREETING_MSG;
	}
}
