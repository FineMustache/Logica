package visao;

import controle.ProcessaAluno;

public class Main {

	public static void main(String[] args) {
		ProcessaAluno.carregar();
		
		ProcessaAluno.saida();
		
		System.out.println("Médias calculadas com sucesso!");

	}

}
