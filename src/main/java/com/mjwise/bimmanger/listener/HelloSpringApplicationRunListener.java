package com.mjwise.bimmanger.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

	public HelloSpringApplicationRunListener(SpringApplication application,String[] args){
		
	}
	@Override
	public void starting() {
		System.out.println("SpringApplicationRunListener ... starting ...");
	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		Object o = environment.getSystemProperties().get("os.name");
		System.out.println("SpringApplicationRunListener ... " +o);
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("SpringApplicationRunListener...contextPrepared...");
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("SpringApplicationRunListener..,");
	}

	@Override
	public void started(ConfigurableApplicationContext context) {
		System.out.println("SpringApplicationRunListener...Started");
	}

	@Override
	public void running(ConfigurableApplicationContext context) {

	}

	@Override
	public void failed(ConfigurableApplicationContext context, Throwable exception) {

	}

}
