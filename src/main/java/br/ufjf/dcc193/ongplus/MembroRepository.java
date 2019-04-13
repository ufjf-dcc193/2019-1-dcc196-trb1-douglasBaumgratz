package br.ufjf.dcc193.ongplus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro, Long>{
    List<Membro> findAll();
}