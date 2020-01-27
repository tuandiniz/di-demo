package br.com.tuan.springcourse.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		
		return "Saludo - Servicio de saludo primario";
	}

}
