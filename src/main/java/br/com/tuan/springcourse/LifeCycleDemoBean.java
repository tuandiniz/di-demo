package br.com.tuan.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {

		System.out.println("## I'm in the LifeCycleBean Constructor");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("## I'm in the LifeCycleBean destructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("## I'm in the LifeCycleBean properties set");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("## I'm in the LifeCycleBean init");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## I'm in the LifeCycleBean preDestroy");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub

	}

}
