package com.vanceav;

import java.net.MalformedURLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vanceav.main.Main;

@SpringBootApplication
public class PowerballApplication {

	public static void main(String[] args) throws MalformedURLException {
		SpringApplication.run(PowerballApplication.class, args);
		
		Main m = new Main();
		m.start();
	}

	

}
