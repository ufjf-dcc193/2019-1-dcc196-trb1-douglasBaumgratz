package br.ufjf.dcc193.ongplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		System.out.println("Hello World!");
		// ConfigurableApplicationContext ctx= SpringApplication.run(MainApplication.class, args);

	}

}
