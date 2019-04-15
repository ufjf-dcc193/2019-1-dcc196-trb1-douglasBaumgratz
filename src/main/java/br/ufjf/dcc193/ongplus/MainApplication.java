package br.ufjf.dcc193.ongplus;

import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;
import br.ufjf.dcc193.ongplus.Persistence.MembroRepository;
import br.ufjf.dcc193.ongplus.Models.Membro;
import br.ufjf.dcc193.ongplus.Models.Sede;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MainApplication.class, args);
		// System.out.println("Hello World!");
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		SedeRepository repSede = ctx.getBean(SedeRepository.class);
		
		Sede sede1 = new Sede("MVX", "b", "c", "d", 1, "3");
		repSede.save(sede1);
		repSede.save(new Sede("HMTJ", "b", "c", "d", 1, "3"));

		// MembroRepository repMembro = ctx.getBean(MembroRepository.class);
		// Date date = new Date();
		// repMembro.save(new Membro(sede1, "b", "c", "d", date, date));

		// System.out.println("foiC"+repMembro.count());
	}
	// public ConfigurableApplicationContext ssdad(String[] args){
	// ConfigurableApplicationContext ctx =
	// SpringApplication.run(MainApplication.class, args);
	// return ctx;
	// }

}
