package com.mjwise.bimmanger.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("ApplicationContextInitializer ..." + applicationContext);
	}
}
