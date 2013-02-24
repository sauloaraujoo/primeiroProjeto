package br.com.first.model;

import java.math.BigDecimal;
import java.util.Date;

public class Funcionario extends Pessoa {
	
	private Long id;
	private String cargo;
	private Date admissao;
	private BigDecimal salario;

	public Funcionario(String nome, String cpf, Endereco endereco, Contato contato, String cargo, Date admissao, BigDecimal salario) {
		super(nome, cpf, endereco, contato);
		this.cargo = cargo;
		this.admissao = admissao;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
}
