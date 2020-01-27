package br.com.tuan.springcourse.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		
		return "Hallo - vom Begrüßungsdienst";
	}

}
