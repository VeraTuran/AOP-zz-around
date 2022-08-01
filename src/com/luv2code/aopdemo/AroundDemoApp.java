package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		// lire la classe spring config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// choper bean du conteneur spring
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

		// messages diagnostiques
		System.out.println("\nMain Program: AroundDemoApp");
		System.out.println("Calling getFortune()");

		// appeler notre nouvelle methode
		String data = theFortuneService.getFortune();

		System.out.println("Mon horoscope aujourd'hui : " + data);
		System.out.println("FIN");

		// close the spring context
		context.close();
	}

}
