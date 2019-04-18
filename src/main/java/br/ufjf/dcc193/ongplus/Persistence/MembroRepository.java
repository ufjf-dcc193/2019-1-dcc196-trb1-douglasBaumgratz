package br.ufjf.dcc193.ongplus.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.ongplus.Models.Membro;



public interface MembroRepository extends JpaRepository<Membro, Long>{
}