package br.ufjf.dcc193.ongplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.dcc193.ongplus.Models.Sede;
import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;

@SpringBootApplication
// @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

public class MainApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MainApplication.class, args);
		// System.out.println("Hello World!");
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		SedeRepository repSede = ctx.getBean(SedeRepository.class);
		
		Sede sede1 = new Sede("MVX", "bbb", "ccc", "ddd", 1, "xx");
		repSede.save(sede1);
		repSede.save(new Sede("HMTJ", "bbb", "ccc", "ddd", 2, "yy"));

		
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
