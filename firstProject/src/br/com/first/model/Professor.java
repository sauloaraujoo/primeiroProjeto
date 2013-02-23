package br.com.first.model;

public class Professor extends Pessoa {
	
	private Long id;
	private Long salario;
	private Titulacao titulacao;
	
	public Professor(String nome, String cpf, Endereco endereco, Contato contato, Long salario, Titulacao titulacao) {
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

	public Long getSalario() {
		return salario;
	}

	public void setSalario(Long salario) {
		this.salario = salario;
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
	
}
