package br.com.tuan.springcourse.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.tuan.springcourse.controlllers.SetterInjectionController;
import br.com.tuan.springcourse.services.GreetingServiceImpl;

public class SetterInjectionControllerTest {

	private SetterInjectionController controller;

	@Before
	public void init() {

		controller = new SetterInjectionController();
		controller.setService(new GreetingServiceImpl());
	}

	@Test
	public void testGreet() {

		String greet = controller.greet();

		assertEquals(GreetingServiceImpl.GREETING_MSG, greet);
	}
}
