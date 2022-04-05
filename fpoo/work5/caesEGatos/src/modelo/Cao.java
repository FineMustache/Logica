package modelo;

public class Cao extends Animal {
	
	private int qtdMotoqueirosAtacados;
	
	public Cao() {
		super();
	}

	public Cao(int qtdMotoqueirosAtacados, String especie, String nome, float peso, String raca) {
		super(especie, nome, peso, raca);
		this.qtdMotoqueirosAtacados = qtdMotoqueirosAtacados;
	}
	
	
}
