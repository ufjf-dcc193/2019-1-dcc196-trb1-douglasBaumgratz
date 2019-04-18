package br.ufjf.dcc193.ongplus.Persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.ongplus.Models.Atividade;



public interface AtividadeRepository extends JpaRepository<Atividade, Long>{
}