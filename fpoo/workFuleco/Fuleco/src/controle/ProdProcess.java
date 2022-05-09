package controle;

import java.util.ArrayList;

import modelo.Produto;

public class ProdProcess {
	public static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static DAO dao =  new DAO();
	
	public static void abrir() {
		produtos = dao.lerProd();
	}
	
	public static void salvar() {
		dao.escreverProd(produtos);
		abrir();
	}
}
