package Sistema;

import java.util.Date;

import Extensions.TimingAspect;

import framework.aop.annotations.Around;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private Date nascimento;
	private int idade;
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	@TimingAspect
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	@TimingAspect
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
