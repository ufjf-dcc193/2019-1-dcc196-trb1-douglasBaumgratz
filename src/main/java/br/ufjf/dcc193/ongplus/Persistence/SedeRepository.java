package br.ufjf.dcc193.ongplus.Persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.ongplus.Models.Sede;

public interface SedeRepository extends JpaRepository<Sede, Long>{
}