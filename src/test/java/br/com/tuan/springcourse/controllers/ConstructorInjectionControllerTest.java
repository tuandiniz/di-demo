package br.com.tuan.springcourse.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.tuan.springcourse.controlllers.ConstructorInjectionController;
import br.com.tuan.springcourse.services.GreetingServiceImpl;

public class ConstructorInjectionControllerTest {
	
	private ConstructorInjectionController controller;

	@Before
	public void init() {

		controller = new ConstructorInjectionController(new GreetingServiceImpl());
	}

	@Test
	public void testGreet() {

		String greet = controller.greet();

		assertEquals(GreetingServiceImpl.GREETING_MSG, greet);
	}
}
