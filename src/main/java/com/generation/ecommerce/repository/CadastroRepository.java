package com.generation.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.ecommerce.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
	
}
