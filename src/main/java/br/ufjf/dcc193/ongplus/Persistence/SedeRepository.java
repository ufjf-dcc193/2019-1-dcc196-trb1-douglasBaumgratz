package br.ufjf.dcc193.ongplus.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.ongplus.Models.Sede;

public interface SedeRepository extends JpaRepository<Sede, Long>{
}