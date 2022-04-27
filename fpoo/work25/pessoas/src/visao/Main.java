package visao;

import controle.ProcessaPessoa;

public class Main {
		
	public static void main(String[] args) {
		ProcessaPessoa.carregar();
		
		ProcessaPessoa.saida();
		
		System.out.println("Arquivo criado");
	}

}
