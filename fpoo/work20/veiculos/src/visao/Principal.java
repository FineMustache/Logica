package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Carro;
import modelo.Moto;

public class Principal {
	
	private static ArrayList<Carro> carros = new ArrayList();
	private static ArrayList<Moto> motos = new ArrayList();
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int menu = 0;
		
		while (menu != 5) {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Carro\n2 - Cadastrar Moto\n3 - Listar Carros\n4 - Listar Motos\n5 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				cadastrarCarro();
				break;
				
			case 2:
				cadastrarMoto();
				break;
				
			case 3:
				listarCarros();
				break;
				
			case 4:
				listarMotos();
				break;
				
			case 5:
				System.out.println("Tchau");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}

	}
	
	public static void cadastrarCarro() {
		System.out.println("Digite o tipo do carro");
		String tipo = s.next();
		
		System.out.println("Digite a qtde de passageiros");
		int passageiros = s.nextInt();
		
		System.out.println("Digite a placa do carro");
		String placa = s.next();
		
		System.out.println("Digite o ano do modelo");
		int anoModelo = s.nextInt();
		
		System.out.println("Digite o ano de fabricação");
		int anoFabricacao = s.nextInt();
		
		System.out.println("Digite o modelo do carro");
		String modelo = s.next();
		
		System.out.println("Digite a marca do carro");
		String marca = s.next();
		
		System.out.println("Digite o valor do carro");
		double valor = s.nextDouble();
		
		carros.add(new Carro(tipo, passageiros, placa, anoModelo, anoFabricacao, modelo, marca, valor));
		
		System.out.println("Carro cadastrado");
	}
	
	public static void cadastrarMoto() {
		System.out.println("Digite o numero de cilindradas");
		int cilindradas = s.nextInt();
		
		System.out.println("Digite a placa da moto");
		String placa = s.next();
		
		System.out.println("Digite o ano do modelo");
		int anoModelo = s.nextInt();
		
		System.out.println("Digite o ano de fabricação");
		int anoFabricacao = s.nextInt();
		
		System.out.println("Digite o modelo da moto");
		String modelo = s.next();
		
		System.out.println("Digite a marca da moto");
		String marca = s.next();
		
		System.out.println("Digite o valor da moto");
		double valor = s.nextDouble();
		
		motos.add(new Moto(cilindradas, placa, anoModelo, anoFabricacao, modelo, marca, valor));
		
		System.out.println("Moto cadastrada");
	}
	
	public static void listarCarros() {
		System.out.println("Placa\tAno Mod\tAno Fab\tModelo\\tMarca\\tValor\\tTipo\\tPassageiros");
		
		for (Carro carro : carros) {
			System.out.println(carro.toString());
		}
	}
	
	public static void listarMotos() {
		System.out.println("Cilindradas\tAno Fab\tAno Mod\tModelo\tMarca\tValor\tTipo\tPassageiros");
		
		for (Moto moto : motos) {
			System.out.println(moto.toString());
		}
	}

}
