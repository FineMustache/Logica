package visao;

import java.util.Scanner;

import controle.Processa;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		Processa.carregar();
		
		int menu = 0;
				
		System.out.println("1 - Soma\t2 - Mult\t3 - Subtração\t4 - Div\t0 - Sair");
		menu = s.nextInt();
		
		Processa.saida(menu);

	}
}
