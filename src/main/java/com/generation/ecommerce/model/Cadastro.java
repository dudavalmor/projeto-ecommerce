package com.generation.ecommerce.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity //gerando tabela no bd
@Table(name = "tb_cadastro") //nome da tabela
public class Cadastro {
	
	@Id //aqui esta indicando que esse atributo será a chave primária da tb_cadastro
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica que a chave primária será gerada pelo próprio bd
	private Long id; //atributo id
	
	@NotBlank(message = "O atributo marca é obrigatório!") 
	@Size(min = 3, max = 15, message = "O atributo marca deve conter no mínimo 03 e no máximo 15 caracteres")
	private String marca; //atributo marca
	
	@NotBlank(message = "O atributo preço é obrigatório!")
	private Float preco; //atributo preco
	
	@NotBlank(message = "O atributo categoria é obrigatório!")
	@Size(min = 3, max = 20, message = "O atributo categoria deve ter no mínimo 03 e no máximo 20 caracteres")
	private String categoria; //atributo categoria
	
	@NotBlank(message = "O atributo código de barras é obrigatório!")
	private String codigoBarras; //atributo codigo de barras
	
	@UpdateTimestamp //obtem a data e hora e insere no atributo data td vez que algum objeto dessa classe for criado ou atualizado
	private LocalDateTime data; //atributo data

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
