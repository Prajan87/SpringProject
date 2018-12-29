package com.spring.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ObjectInjection.Triangle3;
import com.spring.constructorInjection.Triangle2;

public class SpringDemo {

	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
		triangle2.draw();
		
		Triangle3 triangle3 = (Triangle3) context.getBean("triangle alias");
		triangle3.draw();
	}

}
