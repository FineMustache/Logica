package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa {
	
	private int id;
	private double creditoLimite;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, double creditoLimite, String nome, String telefone, Date nascimento) {
		setNome(nome);
		setTelefone(telefone);
		setNascimento(nascimento);
		this.id = id;
		this.creditoLimite = creditoLimite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCreditoLimite() {
		return creditoLimite;
	}

	public void setCreditoLimite(double creditoLimite) {
		this.creditoLimite = creditoLimite;
	}

	public String toString() {
		return id + "\t" + getNome() + "\t" + getTelefone() + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(getNascimento()) + "\t" + creditoLimite;
	}

}
