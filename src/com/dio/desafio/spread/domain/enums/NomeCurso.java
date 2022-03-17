package com.dio.desafio.spread.domain.enums;

public enum NomeCurso {
	
	AUTOGESTAO("Auto Gestao"),
	CULTURAEMPRESARIAL("Cultural Empresarial"),
	RESPONSABILIDADE("Responsabiliade Empresarial"),
	GESTAOEQUIPE("Gestao de Equipes Excel");
	
	private final String nome;

	public String getNome() {
		return nome;
	}

	private NomeCurso(String nome) {
		this.nome = nome;
	}

}
