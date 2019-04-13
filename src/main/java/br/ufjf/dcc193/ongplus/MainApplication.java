package br.ufjf.dcc193.ongplus;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MainApplication.class, args);
		// System.out.println("Hello World!");
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		SedeRepository rep = ctx.getBean(SedeRepository.class);		
		rep.save(new Sede("a","b","c","d",1,"3"));
		rep.save(new Sede("a","b","c","d",1,"3"));	
		System.out.println("foi"+rep.findAll().toString());
	}
	// public ConfigurableApplicationContext ssdad(String[] args){
	// 	ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
	// 	return ctx;	
	// }

}

