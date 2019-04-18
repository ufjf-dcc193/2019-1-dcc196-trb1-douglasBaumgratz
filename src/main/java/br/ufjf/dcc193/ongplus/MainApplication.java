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

		Sede s1 = new Sede("MVX", "Nair Furtado de Souza", "Juiz de Fora", "Centro", 32811716, "www.mvx.com.br");
		Sede s2 = new Sede("YTV", "Rosa Gomes", "Muriaé", "Jardim Alto", 32811656, "www.ytv.com.br");
		repSede.save(s1);
		repSede.save(s2);

		Membro m1 = new Membro(s1, "Zicrano", "Ajudante", "joao@gmail.com", "01/06/2016", "01/06/2017");
		Membro m2 = new Membro(s1, "Beltrano", "Manutenção", "joao@gmail.com", "01/06/2016", "01/06/2017");
		Membro m3 = new Membro(s2, "Ciclano", "Almoxarifado", "joao@gmail.com", "01/06/2016", "01/06/2017");
		repMembro.save(m1);
		repMembro.save(m2);
		repMembro.save(m3);

		Atividade a1 = new Atividade(s1, "Programação OO", "Grupos para desenvolvimento", "01/06/2016", "01/06/2017", 10,
				20, 30, 50);
		Atividade a2 = new Atividade(s1, "Java", "Estudos sobre JAVA", "01/06/2016", "01/06/2017", 10,
				20, 30, 60);
		Atividade a3 = new Atividade(s2, "Spring", "Spring MVC", "01/06/2016", "01/06/2017", 10,
				20, 30, 70);
		repAtividade.save(a1);
		repAtividade.save(a2);
		repAtividade.save(a3);

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
