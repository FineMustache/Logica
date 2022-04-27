package modelo;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private int nasc;
	
	public Pessoa(String entrada) {
		nome = entrada.split(";")[0];
		nasc = Integer.parseInt(entrada.split(";")[1]);
	}
	
	public String toString() {
		int idade = (Calendar.getInstance().get(Calendar.YEAR)) - nasc;

		return nome + ";" + idade;
	}

}
