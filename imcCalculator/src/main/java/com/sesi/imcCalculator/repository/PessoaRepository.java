package com.sesi.imcCalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.imcCalculator.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
