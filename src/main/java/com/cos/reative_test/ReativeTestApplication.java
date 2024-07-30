package com.cos.reative_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReativeTestApplication {

	public static void main(String[] args) {
		MyPub myPub = new MyPub();
		MySub mySub = new MySub();

		myPub.subscribe(mySub);
		//SpringApplication.run(ReativeTestApplication.class, args);
	}

}
