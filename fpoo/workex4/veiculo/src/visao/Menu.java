package visao;

import java.util.Scanner;

import modelo.Veiculo;

public class Menu {
	
	private static Scanner scan = new Scanner(System.in);
	private static Veiculo[] veiculos = new Veiculo[10];
	
	public static void main(String[] args) {
		
		int op = 0;
		
		while (op != 3) {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Veículo\t2 - Listar Veículos");
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
					System.out.println("Digite a placa do veículo");
					String placa = scan.next();
					
					System.out.println("Digite a marca do veículo");
					String marca = scan.next();
					
					System.out.println("Digite o modelo do veículo");
					String modelo = scan.next();
					
					System.out.println("Digite o ano do modelo do veículo");
					int anoModelo = scan.nextInt();
					
					System.out.println("Digite o ano de fabricação do veículo");
					int anoFabricacao = scan.nextInt();
					
					System.out.println("Digite a cor do veículo");
					String cor = scan.next();
					
					veiculos[i] = new Veiculo(placa, marca, modelo, anoModelo, anoFabricacao, cor);
					
					System.out.println("\n\nVeículo Cadastrado com SUCESSO!");
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
			System.out.println("Nenhum veículo cadastrado\n\n");
		}
	}

}
