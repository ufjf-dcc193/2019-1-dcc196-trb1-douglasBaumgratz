package br.ufjf.dcc193.ongplus;

import java.util.ArrayList;
import java.util.List;

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
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		SedeRepository repSede = ctx.getBean(SedeRepository.class);
		MembroRepository repMembro = ctx.getBean(MembroRepository.class);
		AtividadeRepository repAtividade = ctx.getBean(AtividadeRepository.class);

		Sede s1 = new Sede("MVX", "MG", "Juiz de Fora", "Centro", 32811716, "www.mvx.com.br");
		Sede s2 = new Sede("YTV", "MG", "Belo Horizonte", "Jardim Alto", 32811656, "www.ytv.com.br");
		Sede s3 = new Sede("OWTU", "MG", "Tiradentes", "Largo", 32814312, "www.owtu.com.br");
		repSede.save(s1);
		repSede.save(s2);
		repSede.save(s3);

		Membro m1 = new Membro(s1, "Zicrano", "Ajudante", "zicrano@gmail.com", "01/06/2016", "01/06/2017");
		Membro m2 = new Membro(s1, "Beltrano", "Manutenção", "beltrano@gmail.com", "01/06/2016", "01/06/2017");
		Membro m3 = new Membro(s2, "Ciclano", "Almoxarifado", "ciclano@gmail.com", "01/06/2016", "01/06/2017");
		repMembro.save(m1);
		repMembro.save(m2);
		repMembro.save(m3);

		Atividade a1 = new Atividade(s1, "C", "Desenvolvimento", "01/06/2016", "01/06/2017", 25, 25, 25, 25);
		Atividade a2 = new Atividade(s1, "Java", "Estudos sobre JAVA", "01/06/2016", "01/06/2017", 10, 25, 30, 60);
		Atividade a3 = new Atividade(s2, "Spring", "Spring MVC", "01/06/2016", "01/06/2017", 10, 20, 30, 70);
		Atividade a4 = new Atividade(s3, "MVC", "Model/View/Controller", "01/06/2016", "01/06/2017", 100, 50, 30, 70);
		repAtividade.save(a1);
		repAtividade.save(a2);
		repAtividade.save(a3);
		repAtividade.save(a4);

		List<Atividade> as1 = new ArrayList<>();
		as1.add(a1);
		as1.add(a2);
		s1.setAtividades(as1);
		repSede.save(s1);

		List<Atividade> as2 = new ArrayList<>();
		as2.add(a3);
		s2.setAtividades(as2);
		repSede.save(s2);

		List<Atividade> as3 = new ArrayList<>();
		as3.add(a4);
		s3.setAtividades(as3);
		repSede.save(s3);
	}

}
