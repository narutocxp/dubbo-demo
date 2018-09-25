package com.rongji.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.rongji.dubbo.service.GreetingService;

public class Consumer {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[] {"spring-config-dubbo.xml"});
		GreetingService greetingService=ctx.getBean(GreetingService.class);
		System.out.println(greetingService.sayHello("dubbo"));
	}
}
