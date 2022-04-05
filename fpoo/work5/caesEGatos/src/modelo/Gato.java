package modelo;

public class Gato extends Animal{
	
	private int qtdVidas = 7;
	
	public Gato() {
		super();
	}

	public Gato(int qtdVidas, String especie, String nome, float peso, String raca) {
		super(especie, nome, peso, raca);
		this.qtdVidas = qtdVidas;
	}
	
	public String toString() {
		return getEspecie() + "\t" + getNome() + "\t" + getPeso() + "\t" + getRaca() + "\t" + qtdVidas;
	}
}
