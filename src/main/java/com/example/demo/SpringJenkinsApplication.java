package com.example.demo;

import java.lang.System.Logger;

//import org.slf4j.LoggerFactory;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.sun.org.slf4j.internal.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {

		//public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
		for(int i=0;i<5;i++) {
			System.out.println("git repository sync with code in the local");
		}
	}

}
