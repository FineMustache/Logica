package notas;

import java.time.Period;
import java.util.Date;
import notas.Notas;

public class Aluno {
	
	public int ra;
	public String nome;
	public Date nascimento;
	public Notas[] notas = new Notas[4];
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(int ra, String nome, Date nascimento, Notas[] notas) {
		this.ra = ra;
		this.nome = nome;
		this.nascimento = nascimento;
		this.notas = notas;
	}
	
	public int calcIdade() {
		java.util.Date agora = new java.util.Date();  

		if (agora.getMonth() == nascimento.getMonth()) {
			if (agora.getDay() >= nascimento.getDay()) {
				return agora.getYear() - nascimento.getYear();
			} else {
				return agora.getYear() - nascimento.getYear() - 1;
			}
		} else if(agora.getMonth() > nascimento.getMonth()) {
			return agora.getYear() - nascimento.getYear();
		} else {
			return agora.getYear() - nascimento.getYear() - 1;
		}
	}
	
	public String obterConceito() {
		boolean aprovado = true;
		for (int i = 0; i < notas.length; i++) {
			
			if(notas[i].obterMedia() <= 50) {
				aprovado = false;
				break;
			}
		}
		if (aprovado) {
			return "Aluno(a) " + nome + " foi APROVADO!";
		} else {
			return "Aluno(a) " + nome + " foi REPROVADO!";
		}
	}

}
