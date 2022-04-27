package controle;

import java.util.ArrayList;

import modelo.Pessoa;

public class ProcessaPessoa {
	private static ArrayList<Pessoa> linhas = new ArrayList<Pessoa>();
	private static DAO dao = new DAO(); 
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void saida() {
		dao.salvar(linhas);
	}
}
