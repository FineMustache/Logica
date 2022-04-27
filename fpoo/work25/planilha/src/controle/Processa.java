package controle;

import java.util.ArrayList;

import modelo.Planilha;

public class Processa {
	private static ArrayList<Planilha> linhas = new ArrayList<Planilha>();
	private static DAO dao = new DAO(); 
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void saida(int opcao) {
		switch (opcao) {
		case 1:
			
			dao.salvarSoma(linhas);
			break;
			
		case 2:
			
			dao.salvarMult(linhas);
			break;
			
		case 3:
			
			dao.salvarSub(linhas);
			break;
			
		case 4:
			
			dao.salvarDiv(linhas);
			break;
			
		default:
			break;
		}
	}
}
