package modelo;

public class Animal {
	
	private String especie;
	private String nome;
	private float peso;
	private String raca;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String especie, String nome, float peso, String raca) {
		this.especie = especie;
		this.nome = nome;
		this.peso = peso;
		this.raca = raca;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public String getRaca() {
		return raca;
	}
}
