package br.ufjf.dcc193.ongplus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SedeRepository extends JpaRepository<Sede, Long>{
    List<Sede> findAll();
}