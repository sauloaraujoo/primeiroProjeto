package br.com.first.model;

import java.math.BigDecimal;

public class Professor extends Pessoa {
	
	private Long id;
	private BigDecimal salario;
	private Titulacao titulacao;
	
	public Professor(String nome, String cpf, Endereco endereco, Contato contato, BigDecimal salario, Titulacao titulacao) {
		super(nome, cpf, endereco, contato);
		this.salario = salario;
		this.titulacao = titulacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
	
}
