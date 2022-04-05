package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {
	
	private int matricula;
	private double comissao;
	private String senha;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(int matricula, double comissao, String nome, String telefone, Date nascimento, String senha) {
		setNome(nome);
		setTelefone(telefone);
		setNascimento(nascimento);
		setSenha(senha);
		this.matricula = matricula;
		this.comissao = comissao;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean validaSenha(String senha) {
		if(this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return matricula + "\t" + getNome() + "\t" + getTelefone() + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(getNascimento()) + "\t" + comissao;
	}
	
	
}
