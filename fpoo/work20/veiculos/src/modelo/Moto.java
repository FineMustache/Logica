package modelo;

public class Moto extends Veiculo {
	
	private int cilindradas;
	
	public Moto() {
		// TODO Auto-generated constructor stub
	}

	public Moto(int cilindradas, String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor) {
		setPlaca(placa);
		setAnoModelo(anoModelo);
		setAnoFabricacao(anoFabricacao);
		setModelo(modelo);
		setMarca(marca);
		setValor(valor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return cilindradas + "\t" + getAnoFabricacao() + "\t" + getAnoModelo() + "\t" + getMarca() + "\t" + getModelo()
				+ "\t" + getPlaca() + "\t" + getValor();
	}
	
	
}
