package com.mjwise.bimmanger.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication//web应用生效
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoComfiguration {
	@Autowired
	HelloProperties helloProperties;


}
