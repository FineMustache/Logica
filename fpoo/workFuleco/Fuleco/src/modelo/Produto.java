package modelo;

public class Produto {
	private int id;
	private String nome;
	private double pCusto;
	private double pVenda;
	private double lucro;
	private String estoque;
	
	public Produto(int id, String nome, double pCusto, double pVenda, double lucro, String estoque) {
		this.id = id;
		this.nome = nome;
		this.pCusto = pCusto;
		this.pVenda = pVenda;
		this.lucro = lucro;
		this.estoque = estoque;
	}
	
	public Produto(String linha) {
		String[] temp = linha.split(";");
		this.id = Integer.parseInt(temp[0]);
		this.nome = temp[1];
		this.pCusto = Double.parseDouble(temp[2].replace(",", "."));
		this.pVenda = Double.parseDouble(temp[3].replace(",", "."));
		this.lucro = Double.parseDouble(temp[4].replace(",", "."));
		this.estoque = temp[5];
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getpCusto() {
		return pCusto;
	}

	public void setpCusto(double pCusto) {
		this.pCusto = pCusto;
	}

	public double getpVenda() {
		return pVenda;
	}

	public void setpVenda(double pVenda) {
		this.pVenda = pVenda;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public String getEstoque() {
		return estoque;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	public String toCSV() {
		return id + ";" + nome + ";" + String.format("%.2f", pCusto) + ";" + String.format("%.2f", pVenda) + ";" + String.format("%.2f", lucro) + ";" + estoque;
	}

}
