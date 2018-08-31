package com.spoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("editor.xml");
	      EitorText te = (EitorText) context.getBean("textEditor");
	      te.spellCheck();
	   }
}
