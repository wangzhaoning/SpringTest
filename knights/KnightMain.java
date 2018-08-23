package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("knights.xml");
		knight knighttest=context.getBean(knight.class);
		knighttest.embarkOnQuest();
		context.close();
	}
}
