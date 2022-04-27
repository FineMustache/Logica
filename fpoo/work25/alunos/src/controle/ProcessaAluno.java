package controle;

import java.util.ArrayList;

import modelo.Aluno;

public class ProcessaAluno {
	private static ArrayList<Aluno> linhas = new ArrayList<Aluno>();
	private static DAO dao = new DAO(); 
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void saida() {
		dao.salvar(linhas);
	}
}
