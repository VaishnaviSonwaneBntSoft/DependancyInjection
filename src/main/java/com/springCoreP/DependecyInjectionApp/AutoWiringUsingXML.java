package com.springCoreP.DependecyInjectionApp;

import com.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class AutoWiringUsingXML {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student" , Student.class);
		student.show();
	}

}
	