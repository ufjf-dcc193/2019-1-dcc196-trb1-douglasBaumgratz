package br.ufjf.dcc193.ongplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.dcc193.ongplus.Models.Atividade;
import br.ufjf.dcc193.ongplus.Models.Membro;
import br.ufjf.dcc193.ongplus.Models.Sede;
import br.ufjf.dcc193.ongplus.Persistence.AtividadeRepository;
import br.ufjf.dcc193.ongplus.Persistence.MembroRepository;
import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;

@SpringBootApplication
// @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
// DataSourceTransactionManagerAutoConfiguration.class,
// HibernateJpaAutoConfiguration.class})

public class MainApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MainApplication.class, args);
		// System.out.println("Hello World!");
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);

		SedeRepository repSede = ctx.getBean(SedeRepository.class);
		MembroRepository repMembro = ctx.getBean(MembroRepository.class);
		AtividadeRepository repAtividade = ctx.getBean(AtividadeRepository.class);
		
		Sede s1 = new Sede("MVX", "bbb", "ccc", "ddd", 1, "xx");
		repSede.save(s1);

		Membro m1 = new Membro(s1, "João", "Ajudante", "joao@gmail.com", "01/06/2016", "01/06/2017");
		repMembro.save(m1);

		Atividade a1 = new Atividade(s1, "Programação", "Grupos para desenvolvimento", "01/06/2016", "01/06/2017",
				3.00);
		repAtividade.save(a1);

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
