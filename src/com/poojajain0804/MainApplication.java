package com.poojajain0804;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext objApplicationContext= new ClassPathXmlApplicationContext("MySpringBean.xml");
		Greeting objGreeting = (Greeting)objApplicationContext.getBean("objGreetingBean");
		System.out.println("Hi welcome!"+objGreeting.getGreetingMsg());
	}

}
