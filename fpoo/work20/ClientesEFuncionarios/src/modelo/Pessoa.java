package modelo;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private Date nascimento;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String telefone, Date nascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public Date getNascimento() {
		return nascimento;
	}

}
