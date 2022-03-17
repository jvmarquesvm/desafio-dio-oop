package com.dio.desafio.spread;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import com.dio.desafio.spread.domain.Curso;
import com.dio.desafio.spread.domain.Empresa;
import com.dio.desafio.spread.domain.Funcionario;
import com.dio.desafio.spread.domain.Pessoa;
import com.dio.desafio.spread.domain.Treinamento;
import com.dio.desafio.spread.domain.Treinamentos;
import com.dio.desafio.spread.domain.enums.NomeCurso;

public class InicializaEmpresa {
	
	public static void main(String[] args) {
		Empresa dio = new Empresa("Digital Innovation One");
		Treinamentos treinamentos = new Treinamentos();
		Random random = new Random(9999);
		
		treinamentos.setTreinamentos(inicializaTreinamentos1());
		
		Pessoa pessoa1 = new Funcionario(UUID.randomUUID(), 
				                           new Pessoa("João Victor", LocalDate.now().minusYears(23), random.nextInt(999)),
				                             treinamentos.getTreinamentos());
		
		treinamentos.setTreinamentos(inicializaTreinamentos2());
		Pessoa pessoa2 = new Funcionario(UUID.randomUUID(), 
				                           new Pessoa("Camila", LocalDate.now().minusYears(17), random.nextInt(999)),
				                             treinamentos.getTreinamentos() );
		
		Pessoa pessoa3 = new Funcionario(UUID.randomUUID(), 
                                          new Pessoa("José", LocalDate.now().minusYears(17), random.nextInt(999)),
                                               null );
	
		dio.getFuncionarios().add(pessoa1);
		dio.getFuncionarios().add(pessoa2);
		dio.getFuncionarios().add(pessoa3);
		
		System.out.println(dio);
	
	}
	
	private static Set<Curso> inicializaTreinamentos1() {
		
		Set<Curso> treinamentos = new HashSet<>();
		
		Curso treinamento1 = new Treinamento(LocalDate.now().minusMonths(2l), LocalDate.now().minusMonths(3l),
				                                    new Curso(NomeCurso.AUTOGESTAO));
		treinamento1.setNome(NomeCurso.AUTOGESTAO);
		
		Curso treinamento2 = new Treinamento(LocalDate.now().minusMonths(3l), LocalDate.now().minusMonths(4l),
				                                    new Curso(NomeCurso.CULTURAEMPRESARIAL));
		treinamento2.setNome(NomeCurso.CULTURAEMPRESARIAL);
		
		treinamentos.add(treinamento1);
		treinamentos.add(treinamento2);
		return treinamentos;
	}
	
	
	private static Set<Curso> inicializaTreinamentos2() {
		
		Set<Curso> treinamentos = new HashSet<>();
		
		Treinamento treinamento4 = new Treinamento(LocalDate.now().minusMonths(5l), LocalDate.now().minusMonths(6l),
				                                     new Curso(NomeCurso.GESTAOEQUIPE));
		
		Treinamento treinamento5 = new Treinamento(LocalDate.now().minusMonths(6l), LocalDate.now().minusMonths(7l),
				                                     new Curso(NomeCurso.RESPONSABILIDADE));

		treinamentos.add(treinamento4);
		treinamentos.add(treinamento5);
		return treinamentos;
	}

}
