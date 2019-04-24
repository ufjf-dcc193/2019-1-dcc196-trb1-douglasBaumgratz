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
public class MainApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MainApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		SedeRepository repSede = ctx.getBean(SedeRepository.class);
		MembroRepository repMembro = ctx.getBean(MembroRepository.class);
		AtividadeRepository repAtividade = ctx.getBean(AtividadeRepository.class);

		Sede s1 = new Sede("Sede 1", "Estado 1", "Cidade 1", "Bairro 1", 32811716, "www.sede1.com.br");
		Sede s2 = new Sede("Sede 2", "Estado 2", "Cidade 2", "Bairro 2", 32811656, "www.sede2.com.br");
		Sede s3 = new Sede("Sede 3", "Estado 3", "Cidade 3", "Bairro 3", 32814312, "www.sede3.com.br");
		repSede.save(s1);
		repSede.save(s2);
		repSede.save(s3);

		Membro m1 = new Membro(s1, "Membro 1", "Função 1", "funcao1@gmail.com", "01/06/2016", "01/06/2017");
		Membro m2 = new Membro(s1, "Membro 2", "Função 2", "funcao2@gmail.com", "01/06/2016", "01/06/2017");
		Membro m3 = new Membro(s2, "Membro 3", "Função 3", "funcao3@gmail.com", "01/06/2016", "01/06/2017");
		repMembro.save(m1);
		repMembro.save(m2);
		repMembro.save(m3);

		Atividade a1 = new Atividade(s1, "Atividade 1", "Descrição 1", "01/06/2016", "01/06/2017", 25, 25, 25, 25);
		Atividade a2 = new Atividade(s1, "Atividade 2", "Descrição 2", "01/06/2016", "01/06/2017", 10, 25, 30, 60);
		Atividade a3 = new Atividade(s2, "Atividade 3", "Descrição 3", "01/06/2016", "01/06/2017", 10, 20, 30, 70);
		Atividade a4 = new Atividade(s3, "Atividade 4", "Descrição 4", "01/06/2016", "01/06/2017", 100, 50, 30, 70);
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
