package ex;

import java.util.Scanner;
import ex.Aluno;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Aluno[] alunos = new Aluno[10];
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = null;
		}
		
		System.out.println("Digite uma opção");
		
		int menu = 0;
		
		while(menu != 4) {
			System.out.println("1 - Cadastrar novo Usuário\n2 - Buscar por número de matrícula\n3 - Buscar por nome\n4 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			
			case 1:
				
				for (int i = 0; i < alunos.length; i++) {
					if (alunos[9] == null) {
						if(alunos[i] == null) {
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
							break;
						}
					} else {
						System.out.println("Limite Excedido");
						break;
					}
				}
				
				break;
			
			case 2: 
				
				System.out.println("\nDigite o número de matrícula para ser buscado:");
				int n = s.nextInt();
				
				System.out.println("\nMatrícula\tNome\tNota 1\tNota 2\tNota 3");
				
				for (int i = 0; i < alunos.length; i++) {
					if(alunos[i] != null && alunos[i].matricula == n) {
						alunos[i].mostraAluno();
					}
				}
				
				break;
				
			case 3:
				
				System.out.println("Digite o nome para ser buscado:");
				String nome = s.next();
				
				System.out.println("\nMatrícula\tNome\tNota 1\tNota 2\tNota 3");
				
				for (int i = 0; i < alunos.length; i++) {
					if(alunos[i] != null && alunos[i].nome.equals(nome)) {
						alunos[i].mostraAluno();
					}
				}
				
				break;
				
			case 4:
				
				System.out.println("Adeus");
			
				break;
			default:
				System.out.println("Opção Inváida");
				break;
			}
		}
	}

}
