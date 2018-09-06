package com.sadhna.helloworld.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		//loading the definistions from the given xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		
		String message = service.sayHello();
		
		System.out.println(message);
		
		service.setName("sadhna");
		String message1 = service.sayHello();
		
		System.out.println(message1);
		
		
		/// loading SpringBeanExampleService bean
		SpringBeanExampleService exBean = (SpringBeanExampleService) context.getBean("springBeanExampleService");
		exBean.setName("Sadhna juhirdeen");
		exBean.setEmail("sadhna@gmail.com");
		exBean.setAge(26);
		
		
		System.out.println("printing bean set values");
		System.out.println("Name is: "+ exBean.getName());
		System.out.println("Age is: "+ exBean.getAge());
		System.out.println("Email is: "+ exBean.getEmail());
		
		
		
		
	}
	

}
