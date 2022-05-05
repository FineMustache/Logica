package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {
	
	private int id;
	private String especie;
	private String nomePet;
	private String raca;
	private float peso;
	private Date nascimento;
	private String nomeDono;
	private String telefone;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Pet(int id) {
		this.id = id;
	}
	
	public Pet(int id, String especie, String nomePet, String raca, float peso, String nascimento, String nomeDono,
			String telefone) {
		this.id = id;
		this.especie = especie;
		this.nomePet = nomePet;
		this.raca = raca;
		this.peso = peso;
		try {
			this.nascimento = sdf.parse(nascimento);
		} catch (ParseException e) {
			System.out.println(e.toString());
		}
		this.nomeDono = nomeDono;
		this.telefone = telefone;
	}
	
	public Pet(String linha) {
		String[] temp = linha.split(";");
		this.id = Integer.parseInt(temp[0]);
		this.especie = temp[1];
		this.nomePet = temp[2];
		this.raca = temp[3];
		this.peso = Float.parseFloat(temp[4].replace(",", "."));
		try {
			this.nascimento = sdf.parse(temp[5]);
		} catch (ParseException e) {
			System.out.println(e.toString());
		}
		this.nomeDono = temp[6];
		this.telefone = temp[7];
	}
	
	public int obterIdade() {
		return new Date().getYear() - nascimento.getYear();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toCSV() {
		return this.id + ";" + this.especie + ";" + this.nomePet + ";" + this.raca + ";" + String.format("%.2f", this.peso).replace(".", ",") + ";" + sdf.format(this.nascimento) + ";" + this.nomeDono + ";" + this.telefone;
	}
	
}
