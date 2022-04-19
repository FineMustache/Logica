package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		
		int opcao = 0; 
		
		do {
			System.out.println("1 - Cadastrar\t2 - Listar\t0 - Sair");
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			case 1:
				
				System.out.println("Informe o seu nome: ");
				String nome = s.nextLine();
				
				System.out.println("Informe sua idade: ");
				String idade = s.next();
				
				System.out.println("Informe sua cidade: ");
				s.nextLine();
				String cidade = s.nextLine();
				
				String data = nome + ";" + idade + ";" + cidade;
				
				arq.escrever(data, "Pessoas", true);
				break;
				
			case 2:
				ArrayList<String> infoFile = arq.ler("Pessoas");
				
				System.out.println("Digite o nome que deseja buscar");
				String busca = s.nextLine();
				
				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					if(temp[0].toLowerCase().contains(busca.toLowerCase())) {
						System.out.println("Nome: " + temp[0]);
						System.out.println("Idade: " + temp[1]);
						System.out.println("Cidade: " + temp[2]);
						System.out.println("-------------------");
					}
					
				}
				break;
				
			case 0:
				System.out.println("podicre flw");
				
			default:
				System.out.println("Ta bobiano");
				break;
			}
		} while (opcao != 0);

	}
}