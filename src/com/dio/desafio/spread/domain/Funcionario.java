package com.dio.desafio.spread.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

//Aplicado herança entre Funcionario e Pessoa
public class Funcionario extends Pessoa {
	
	public Funcionario() {

	}

	public Funcionario(UUID id, Pessoa pessoa, Set<Curso> treinamentos) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.treinamentos = treinamentos;
	}

	private UUID id;
	private Pessoa pessoa;
	private Set<Curso> treinamentos = new HashSet<>();
	
	public Set<Curso> getTreinamentos() {
		return treinamentos;
	}

	public void setTreinamentos(Set<Curso> treinamentos) {
		this.treinamentos = treinamentos;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", pessoa=" + pessoa + ", treinamentos=" + treinamentos + "]";
	}

}
