package com.algaworks.crm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

//Model

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //O banco de dados fica responsável por gerar o ID
	private Long id;
	
	@Column(nullable = false) // Not null 
	private String nome;
}
