package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Cadastro;
import com.generation.ecommerce.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CadastroController {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Cadastro>> getAll(){
		return ResponseEntity.ok(cadastroRepository.findAll());
	}
	
	@GetMapping
	public ResponseEntity<Cadastro> getById(@PathVariable Long id){
		return cadastroRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
}
