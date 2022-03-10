package notas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import notas.Aluno;
import notas.Notas;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		int menu = 0;
		
		Aluno[] alunos = new Aluno[10];
		
		while (menu != 8) {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Alunos\n2 - Cadastrar Notas\n3 - Listar todos os Alunos\n4 - Listar todas as Notas\n5 - Obter os dados de um aluno específico\n6 - Listar alunos Aprovados\n7 - Listar alunos Reprovados\n8 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				for (int i = 0; i < alunos.length; i++) {
					if (alunos[9] == null) {
						if(alunos[i] == null) {
							System.out.println("Digite o nome do Aluno");
							String nome = s.next();
							
							System.out.println("Digite a data de nascimento do Aluno (EX: 01/01/1999)");
							String nasc = s.next();
						    Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nasc);
							
						    Notas[] notas = new Notas[4];
						    
						    float[] nota = new float[3];
						    
							for (int j = 0; j < 4; j++) {
								System.out.println("Digite o nome da matéria para inserir as notas");
								String componente = s.next();
								
								for (int k = 0; k < 3; k++) {
									System.out.println("Digite a " + (i+1) + "ª Nota:");
									nota[k] = s.nextFloat();
								}
								
								notas[j] = new Notas(componente, nota);
								
							}
							
							int ra = i+1;
							
							alunos[i] = new Aluno(ra, nome, nascimento, notas);
							
							System.out.println("__________________________");
							break;
						}
					} else {
						System.out.println("Limite Excedido");
						break;
					}
				}
				break;

			default:
				break;
			}
		}
	}

}
