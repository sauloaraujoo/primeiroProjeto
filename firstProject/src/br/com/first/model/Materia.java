package br.com.first.model;

public class Materia {

	private Long id;
	private String descricao;
	private Integer codigo;
	private Professor professor;
	
	public Materia(String descricao, Integer codigo, Professor professor) {
		this.descricao = descricao;
		this.codigo = codigo;
		this.professor = professor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
