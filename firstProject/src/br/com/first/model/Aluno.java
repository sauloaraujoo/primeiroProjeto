package br.com.first.model;

import java.util.List;

public class Aluno extends Pessoa {


	private Long id;
	private Long nota;
	private Integer semestre;
	private List<Materia> materias;
	
	public Aluno(String nome, String cpf, Endereco endereco, Contato contato, Long nota, Integer semestre, List<Materia> materias) {
		super(nome, cpf, endereco, contato);
		this.nota = nota;
		this.semestre = semestre;
		this.materias = materias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNota() {
		return nota;
	}

	public void setNota(Long nota) {
		this.nota = nota;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
}
