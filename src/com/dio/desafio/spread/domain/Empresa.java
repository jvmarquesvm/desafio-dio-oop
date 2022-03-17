package com.dio.desafio.spread.domain;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nome;
	List<Pessoa> funcionarios = new ArrayList<>();

	public Empresa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Pessoa> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", funcionarios=" + funcionarios + "]";
	}
	
	


}
