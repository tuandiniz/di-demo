package br.com.tuan.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.tuan.springcourse.controlllers.ConstructorInjectionController;
import br.com.tuan.springcourse.controlllers.MyController;
import br.com.tuan.springcourse.controlllers.PropertyInjectionController;
import br.com.tuan.springcourse.controlllers.SetterInjectionController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

//		System.out.println(((MyController) context.getBean("myController")).hello());		
//		System.out.println(context.getBean(PropertyInjectionController.class).greet());		
//		System.out.println(context.getBean(SetterInjectionController.class).greet());
//		System.out.println(context.getBean(ConstructorInjectionController.class).greet());
	}

}
