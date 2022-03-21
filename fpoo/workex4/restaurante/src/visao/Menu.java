package visao;

import java.util.Scanner;

import modelo.Prato;

public class Menu {
	
	private static Scanner scan = new Scanner(System.in);
	private static Prato[] pratos = new Prato[10];
	
	public static void main(String[] args) {
		int op = 0;
		
		while (op != 3) {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Prato\t2 - Listar Pratos");
			op = scan.nextInt();
			
			switch (op) {
			case 1:
				cadastrarPrato();
				break;
				
			case 2:
				listarPratos();
				break;
				
			case 3:
				System.out.println("Valeu meu cria");
				break;
				
			default:
				System.out.println("Ta bobiano");
				break;
			}
		}

	}
	
	private static void cadastrarPrato() {
		if (pratos[9] == null) {
			for (int i = 0; i < pratos.length; i++) {
				if (pratos[i] == null) {
					int codigoPrato = i+1;
					
					System.out.println("Digite o tipo do Prato");
					String tipo = scan.next();
					
					System.out.println("Digite o nome do Prato");
					String nome = scan.next();
					
					System.out.println("Digite a descrição do Prato");
					String descricao = scan.next();
					
					System.out.println("Digite o preço do Prato");
					float preco = scan.nextFloat();
					
					pratos[i] = new Prato(codigoPrato, tipo, nome, descricao, preco);
					
					System.out.println("\n\nPrato Cadastrado com SUCESSO!");
					break;
				}
			}
		} else {
			System.out.println("Limite Excedido");
		}
	}
	
	private static void listarPratos() {
		if (pratos[0] != null) {
			System.out.println("COD\tTIPO\tNOME\tDESC\tPREÇO");
			for (int i = 0; i < pratos.length; i++) {
			
				if (pratos[i] != null) {
					System.out.println(pratos[i].paraString());
				}
			}
		} else {
			System.out.println("Nenhum prato cadastrado\n\n");
		}
	}

}
