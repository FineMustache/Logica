package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	private static Arquivo arq = new Arquivo();
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Pessoa\t2 - Listar Pessoas\t3 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				cadastrarPessoa();
				break;
				
			case 2:
				listarPessoas();
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
	
	private static void cadastrarPessoa() {
		System.out.println("Digite o nome do cidadão aí meu");
		s.nextLine();
		String nome = s.nextLine();
		
		System.out.println("Digite a data de nascimento no modelo dd/mm/aaaa");
		String nasc = s.next();
		
		String data = nome + ";" + nasc;
		
		arq.escrever(data, "Pessoas", true);
		
		System.out.println("Pessoa Cadastrada!");
	}
	
	private static void listarPessoas() {
		ArrayList<String> dados = arq.ler("Pessoas");
		
		System.out.println("Nome\t\tIdade");
		
		for (String linha : dados) {
			String[] temp = linha.split(";");
			
			try {
				System.out.println(temp[0] + "\t" + calcIdade(new SimpleDateFormat("dd/MM/yyyy").parse(temp[1])));
			} catch (ParseException e) {
				System.out.println(e.toString());
			}
		}
		
		System.out.println("--------------------\n");
	}
	
	private static int calcIdade(Date nasc) {
		Date now = new Date();
		
		if (now.getMonth() == nasc.getMonth()) {
			if (now.getDay() >= nasc.getDay()) {
				return now.getYear() - nasc.getYear();
			} else {
				return now.getYear() - nasc.getYear() - 1;
			}
		} else if(now.getMonth() > nasc.getMonth()) {
			return now.getYear() - nasc.getYear();
		} else {
			return now.getYear() - nasc.getYear() - 1;
		}
	}
}
