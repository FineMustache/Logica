package visao;

import java.util.Scanner;

import modelo.Veiculo;

public class Menu {
	
	private static Scanner scan = new Scanner(System.in);
	private static Veiculo[] veiculos = new Veiculo[10];
	
	public static void main(String[] args) {
		
		int op = 0;
		
		while (op != 3) {
			System.out.println("Digite uma op��o");
			System.out.println("1 - Cadastrar Ve�culo\t2 - Listar Ve�culos");
			op = scan.nextInt();
			
			switch (op) {
			case 1:
				cadastrarVeiculo();
				break;
				
			case 2:
				listarVeiculos();
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
	
	private static void cadastrarVeiculo() {
		for (int i = 0; i < veiculos.length; i++) {
			if (veiculos[9] == null) {
				if(veiculos[i] == null) {
					System.out.println("Digite a placa do ve�culo");
					String placa = scan.next();
					
					System.out.println("Digite a marca do ve�culo");
					String marca = scan.next();
					
					System.out.println("Digite o modelo do ve�culo");
					String modelo = scan.next();
					
					System.out.println("Digite o ano do modelo do ve�culo");
					int anoModelo = scan.nextInt();
					
					System.out.println("Digite o ano de fabrica��o do ve�culo");
					int anoFabricacao = scan.nextInt();
					
					System.out.println("Digite a cor do ve�culo");
					String cor = scan.next();
					
					veiculos[i] = new Veiculo(placa, marca, modelo, anoModelo, anoFabricacao, cor);
					
					System.out.println("\n\nVe�culo Cadastrado com SUCESSO!");
					break;
				}
			} else {
				System.out.println("Limite Excedido (10/10)");
			}
		}
	}
	
	private static void listarVeiculos() {
		if (veiculos[0] != null) {
			System.out.println("PLACA\tMARCA\tMODELO\tANO MOD\tANO FAB\tCOR");
			for (int i = 0; i < veiculos.length; i++) {
			
				if (veiculos[i] != null) {
					System.out.println(veiculos[i].paraString());
				}
			}
		} else {
			System.out.println("Nenhum ve�culo cadastrado\n\n");
		}
	}

}
