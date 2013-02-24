package br.com.first.model;

import java.math.BigDecimal;

public class Coordenador extends Pessoa {
	
	private Long id;
	private BigDecimal salario;
	private String curso;
	
	public Coordenador(String nome, String cpf, Endereco endereco, Contato contato, BigDecimal salario, String curso) {
		super(nome, cpf, endereco, contato);
		this.salario = salario;
		this.curso = curso;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
