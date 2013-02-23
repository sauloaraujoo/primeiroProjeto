package br.com.first.model;

public class Endereco {

	private Long id;
	private String logradouro;
	private Integer numero;
	private String bairro;
	
	public Endereco(String logradouro, Integer numero, String bairro) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
