package modelo;

import java.text.DecimalFormat;

public class Aluno {
	private String nome;
	private double n1;
	private double n2;
	private double n3;
	
	public Aluno(String entrada) {
		nome = entrada.split(";")[0];
		n1 = Double.parseDouble(entrada.split(";")[1]);
		n2 = Double.parseDouble(entrada.split(";")[2]);
		n3 = Double.parseDouble(entrada.split(";")[3]);
	}
	
	public String toString() {
		double md = (n1 + n2 + n3) / 3;
		
		return nome + ";" + (new DecimalFormat("0.00").format(md));
	}
}