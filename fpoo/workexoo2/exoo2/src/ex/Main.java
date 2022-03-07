package ex;

import java.util.Scanner;
import ex.Aluno;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int qtde;
		
		do {
			
			System.out.println("Digite quantos alunos deseja cadastrar (max. 10):");
			qtde = s.nextInt();
			
			if(qtde > 10) {
				System.out.println("Valor excede o limite");
			}
			
		} while(qtde > 10);
		
		
		Aluno[] alunos = new Aluno[qtde];
		
		for (int i = 0; i < qtde; i++) {
			System.out.println("Digite o nome do Aluno");
			String nome = s.next();
			
			System.out.println("Digite a primeira nota");
			double nota1 = s.nextDouble();
			
			System.out.println("Digite a segunda nota");
			double nota2 = s.nextDouble();
			
			System.out.println("Digite a terceira nota");
			double nota3 = s.nextDouble();
			
			int matricula = i+1;
			
			alunos[i] = new Aluno(nome, matricula, nota1, nota2, nota3);
			
			System.out.println("__________________________");
		}
		
		System.out.println("Digite uma opção");
		
		int menu = 0;
		
		while(menu != 3) {
			System.out.println("1 - Buscar por número de matrícula\n2 - Buscar por nome\n3 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1: 
				
				System.out.println("\nDigite o número de matrícula para ser buscado:");
				int n = s.nextInt();
				
				System.out.println("\nMatrícula\tNome\tNota 1\tNota 2\tNota 3");
				
				for (int i = 0; i < alunos.length; i++) {
					if(alunos[i].matricula == n) {
						alunos[i].mostraAluno();
					}
				}
				
				break;
				
			case 2:
				
				System.out.println("Digite o nome para ser buscado:");
				String nome = s.next();
				
				System.out.println("\nMatrícula\tNome\tNota 1\tNota 2\tNota 3");
				
				for (int i = 0; i < alunos.length; i++) {
					if(alunos[i].nome.equals(nome)) {
						alunos[i].mostraAluno();
					}
				}
				
				break;
				
			case 3:
				
				System.out.println("Adeus");
			
				break;
			default:
				System.out.println("Opção Inváida");
				break;
			}
		}
	}

}
