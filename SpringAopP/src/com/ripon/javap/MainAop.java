package com.ripon.javap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripon.javab.bank.Bank;

public class MainAop {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Bank b = (Bank) ctx.getBean("bank");
		b.getAbc().toString();
		System.out.println();
		b.getBd().toString();
	}

}
