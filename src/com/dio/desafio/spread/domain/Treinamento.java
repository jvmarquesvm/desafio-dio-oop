package com.dio.desafio.spread.domain;

import java.time.LocalDate;
//Aplicado herança entre Treinamento e Curso
public class Treinamento extends Curso {
	
	private LocalDate inicio;
	private LocalDate fim;
	private Curso curso;
	
	public Treinamento(LocalDate inicio, LocalDate fim, Curso curso) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.curso = curso;
	}
	
	public LocalDate getInicio() {
		return inicio;
	}
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	public LocalDate getFim() {
		return fim;
	}
	public void setFim(LocalDate fim) {
		this.fim = fim;
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Treinamento [inicio=" + inicio + ", fim=" + fim + ", curso=" + curso + "]";
	}

	
}
