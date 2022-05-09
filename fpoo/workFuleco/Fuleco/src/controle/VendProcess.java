package controle;

import java.util.ArrayList;

import modelo.Venda;

public class VendProcess {
	public static ArrayList<Venda> vendas = new ArrayList<Venda>();
	private static DAO dao =  new DAO();
	
	public static void abrir() {
		vendas = dao.lerVenda();
	}
	
	public static void salvar() {
		dao.escreverVenda(vendas);
		abrir();
	}
}
