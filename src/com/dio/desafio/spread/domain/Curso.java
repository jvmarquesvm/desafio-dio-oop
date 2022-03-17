package com.dio.desafio.spread.domain;

import com.dio.desafio.spread.domain.enums.NomeCurso;

public class Curso {
	
	public Curso(NomeCurso nome) {
		super();
		this.nome = nome;
	}
	
	public Curso() {

	}

	private NomeCurso nome;

	public NomeCurso getNome() {
		return nome;
	}

	public void setNome(NomeCurso nomeCurso) {
		this.nome = nomeCurso;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (nome != other.nome)
			return false;
		return true;
	}
	

}
