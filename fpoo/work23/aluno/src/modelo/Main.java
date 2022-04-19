package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	public static void main(String[] args) {
		
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Aluno\t2 - Listar Alunos\t3 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				cadastrarAluno();
				break;
				
			case 2:
				listarAlunos();
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
	
	private static void cadastrarAluno() {
		System.out.println("Digite o nome do dito cujo");
		s.nextLine();
		String nome = s.nextLine();
		
		System.out.println("Digite a primeira nota do aluno");
		double n1 = s.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno");
		double n2 = s.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno");
		double n3 = s.nextDouble();
		
		String data = nome + ";" + n1 + ";" + n2 + ";" + n3;
		
		arq.escrever(data, "Alunos", true);
		
		System.out.println("Aluno cadastrado!\n\n");
	}
	
	private static void listarAlunos() {
		ArrayList<String> dados = arq.ler("Alunos");
		
		System.out.println("Nome\t\tMedia");
		
		for (String aluno : dados) {
			String[] temp = aluno.split(";");
			
			double media = (Double.parseDouble(temp[1]) + Double.parseDouble(temp[2]) + Double.parseDouble(temp[3])) / 3;
			
			System.out.printf("%s\t%.2f\n", temp[0], media);
		}
	}

}
