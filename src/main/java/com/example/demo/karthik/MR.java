package com.example.demo.karthik;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MR implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
	int a=10;
		System.out.println("karthik"+a);

	}

}
