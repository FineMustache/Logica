package modelo;

import java.util.Scanner;

public class Vetor {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		int comprimento = 3;
		
		String[] nomes = new String[comprimento];
		int[] idades = new int[comprimento];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Nome[" + i + "]: ");
			nomes[i] = entrada.next();
			
			System.out.print("Idade[" + i + "]");
			idades[i] = entrada.nextInt();
			
		}
		
		for (int i = 0; i < comprimento; i++) {
			if(idades[i] < 10) {
				System.out.println(nomes[i] + " crian�a.");
			} else if(idades[i] < 20){
				System.out.println(nomes[i] + " jovem.");
			} else {
				System.out.println(nomes[i] + " veio.");
			}
		}
		
		
	}

}
