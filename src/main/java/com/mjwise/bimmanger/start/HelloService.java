package com.mjwise.bimmanger.start;

public class HelloService {
	HelloProperties helloProperties;

	public String sayHelloBIM(String name){
		return helloProperties.getPerfix() + "-" + name + helloProperties.getSuffix();
	}
}
