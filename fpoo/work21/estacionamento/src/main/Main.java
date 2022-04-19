package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	private static Pattern padrao = Pattern.compile("\\d{2}-\\d{2}"); 
	
	public static void main(String[] args) {
		int menu = 0;
		
		do {
			System.out.println("1 - Cadastrar Carro\t2 - Listar Carros\t3 - Buscar Carro\t0 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Digite a placa do carro");
				String placa = s.next();
				if (placa.matches("^\S{3}-\d{4}")) {
					
				}
				
				System.out.println("Digite a marca do carro");
				String marca = s.next();
				
				System.out.println("Digite o modelo do carro");
				String modelo = s.next();
				
				System.out.println("Digite a cor do carro");
				String cor = s.next();
				
				String data = placa + ";" + marca + ";" + modelo + ";" + cor;
				
				arq.escrever(data, "Carros", true);
				
				break;
				
			case 2:
				ArrayList<String> carros = arq.ler("Carros");
				
				for (String carro : carros) {
					String[] temp = carro.split(";");
					System.out.println("Placa: " + temp[0]);
					System.out.println("Marca: " + temp[1]);
					System.out.println("Modelo: " + temp[2]);
					System.out.println("Cor: " + temp[3]);
					System.out.println("--------------------");
				}
				
				break;
				
			case 3:
				
				ArrayList<String> arqInfo = arq.ler("Carros");
				
				System.out.println("Digite a placa que deseja buscar");
				String busca = s.next();
				
				for (String carro : arqInfo) {
					String[] temp = carro.split(";");
					
					if (temp[0].toLowerCase().contains(busca.toLowerCase())) {
						System.out.println("Placa: " + temp[0]);
						System.out.println("Marca: " + temp[1]);
						System.out.println("Modelo: " + temp[2]);
						System.out.println("Cor: " + temp[3]);
						System.out.println("--------------------");
					}					
				}
				
				break;
			
			case 0:
				System.out.println("pode cre valeu flw");
				break;
				
			default:
				System.out.println("Ta bobiano");
				break;
			}
		} while (menu != 0);
		
	}

}
