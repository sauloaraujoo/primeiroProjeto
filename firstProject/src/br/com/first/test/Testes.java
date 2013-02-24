package br.com.first.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.com.first.model.Aluno;
import br.com.first.model.Contato;
import br.com.first.model.Endereco;
import br.com.first.model.Materia;
import br.com.first.model.Professor;
import br.com.first.model.Titulacao;

public class Testes {
	
	@Test
	public void CadastrarAlunoVazio(){
		Endereco enderecoAluno = new Endereco("Rua A", 200, "Varjota");
		Contato contato = new Contato("32670223", "87554744", "sauloaraujo@hot.com");
		List<Materia> materias = new ArrayList<Materia>();
		
		materias.add(new Materia("IA", 701, new Professor("Paulo benicio", "4714201", new Endereco("Rua P", 24, "Papicu"), new Contato("7474749", "874653", "pbenicio@gmail.com"), new BigDecimal(2500.99), Titulacao.DOUTORADO)) );
		
		Aluno aluno = new Aluno("Saulo", "02428312", enderecoAluno, contato, (long) 100, 6, materias);
		
//		System.out.println(aluno.getEndereco());
//		System.out.println(aluno.getContato().getEmail());
//		
//		if(aluno == null){
//			System.out.println("OK");
//		}else 
//			System.out.println("Não OK");
//		
//		Aluno aluno2 = null;
		
		Assert.assertEquals(aluno.getCpf(), "");
		Assert.assertEquals(aluno.getEndereco(), null);
		Assert.assertEquals(aluno.getMaterias().size(), 0);
	}

}
