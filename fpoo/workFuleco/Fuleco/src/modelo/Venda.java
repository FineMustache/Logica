package modelo;

public class Venda {
	private int id;
	private int idProd;
	private int qtde;
	private double pTotal;
	private String pag;
	
	public Venda(int id, int idProd, int qtde, double pTotal, String pag) {
		this.id = id;
		this.idProd = idProd;
		this.qtde = qtde;
		this.pTotal = pTotal;
		this.pag = pag;
	}
	
	public Venda(String linha) {
		String[] temp = linha.split(";");
		
		this.id = Integer.parseInt(temp[0]);
		this.idProd = Integer.parseInt(temp[1]);
		this.qtde = Integer.parseInt(temp[2]);
		this.pTotal = Double.parseDouble(temp[3].replace(",", "."));
		this.pag = temp[4];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getpTotal() {
		return pTotal;
	}

	public void setpTotal(double pTotal) {
		this.pTotal = pTotal;
	}

	public String getPag() {
		return pag;
	}

	public void setPag(String pag) {
		this.pag = pag;
	}

	public String toCSV() {
		return id + ";" + idProd + ";" + qtde + ";" + pTotal + ";" + pag;
	}
}
