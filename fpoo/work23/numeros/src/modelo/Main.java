package modelo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	public static void main(String[] args) {
		
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção");
			System.out.println("1 - Criar ou Substituir arquivo\t2 - Listar Números\t3 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				gerarArquivo();
				break;
				
			case 2:
				listarNumeros();
				break;
				
			case 3:
				System.out.println("vlw flw");
				break;
				
			default:
				System.out.println("Ta bobiano meu");
				break;
			}
			
		} while (menu != 3);

	}
	
	private static void gerarArquivo() {
		Random r = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		for (int i = 0; i < 10; i++) {
			nums.add(r.nextInt(100)); 
		}
		
		arq.escrever(nums, "Numeros", false);
		System.out.println("Arquivo gerado com sucesso");
	}
	
	private static void listarNumeros() {
		ArrayList<Integer> dados = arq.ler("Numeros");
		
		dados.sort(null);
		
		for (Integer num : dados) {
			System.out.println(num);
		}
	}
	
}
