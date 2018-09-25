package com.rongji.dubbo.service.impl;


import com.rongji.dubbo.service.GreetingService;

public class GreetingServiceImpl implements GreetingService{

	public String sayHello(String name) {
		return name+"你好! from dubbo-provider-01";
	}

}
