package com.rba.core.RaumBuchung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RaumBuchungApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaumBuchungApplication.class, args);
		System.out.println("Running!");
		System.out.println("Some dependencies may be commented out, you can switch them on and off as per you end up using them");
	}

}
