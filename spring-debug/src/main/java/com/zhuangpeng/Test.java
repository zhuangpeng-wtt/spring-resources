package com.zhuangpeng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuangpeng
 */
public class Test {
	public static void main(String[ ] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
		Person person = ac.getBean(Person.class);
		System.out.println(person);
	}
}
