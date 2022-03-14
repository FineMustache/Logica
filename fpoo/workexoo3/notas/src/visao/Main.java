package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.Aluno;
import modelo.Notas;

public class Main {
	
	static Aluno[] alunos = new Aluno[10];
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		
		int menu = 0;
		
		while (menu != 8) {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Alunos\n2 - Cadastrar Notas\n3 - Listar todos os Alunos\n4 - Listar todas as Notas\n5 - Obter os dados de um aluno específico\n6 - Listar alunos Aprovados\n7 - Listar alunos Reprovados\n8 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				cadastrarAluno();
				break;
				
			case 2:
				
				cadastrarNota();
				
			    break;
			    
			case 3:
				
				listarAlunos();
				
				break;
				
			case 4:
				
				listarNotas();
				
				break;
				
			case 5:
				
				int op = 0;
				
				Aluno aluno = null;
				
				while(op != 1 && op != 2) {
					System.out.println("Selecione uma opção de busca\n1 - RA\n2 - NOME");
					op = s.nextInt();
					
					
					
					switch (op) {
					case 1:
						
						System.out.println("Digite o RA do aluno que deseja buscar:");
						int id = s.nextInt();
						
						aluno = obterAluno(id);
						
						break;
						
					case 2:
						
						System.out.println("Digite o NOME do aluno que deseja buscar:");
						String name = s.next();
						
						aluno = obterAluno(name);
						
						break;
						
					default:
						
						System.out.println("Opção inválida");
						
						break;
					}
				}
				
				
				
				System.out.println("\nRA\tNome\tNascimento\tIdade");
				
				
				if(aluno != null) {
					System.out.println(aluno.ra + "\t" + aluno.nome + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(aluno.nascimento) + "\t" + aluno.calcIdade());
				} else {
					System.out.println("Aluno não encontrado");
				}
				
				
				break;
				
			case 6:
				
				
				
				break;
				
			case 7:
				
				System.out.println("Alunos REPROVADOS:");
				
				for (int i = 0; i < alunos.length; i++) {
					if (alunos[i] != null && alunos[i].obterConceito().equals("Aluno(a) " + alunos[i].nome + " foi REPROVADO!")) {
						
						System.out.println(alunos[i].nome);
						
						System.out.println("\tComp.\tNota 1\tNota 2\tNota 3\tMédia\n");
						for (int j = 0; j < alunos[i].notas.length; j++) {
							System.out.print("\t" + alunos[i].notas[j].componente);
							for (int j2 = 0; j2 < alunos[i].notas[j].notas.length; j2++) {
								System.out.print("\t" + alunos[i].notas[j].notas[j2]);
							}
							if(alunos[i].notas[j].obterMedia() <= 50) {
								System.out.printf("\t|%.2f|", alunos[i].notas[j].obterMedia());
								System.out.println("\n");
							} else {
								System.out.printf("\t%.2f", alunos[i].notas[j].obterMedia());
								System.out.println("\n");
							}
							
						}
						System.out.println(alunos[i].obterConceito());
						System.out.println("\n");
					}
				}
				
				break;
				
			case 8:
				
				System.out.println("Adeus :D");
				
				break;
			
			default:
				
				System.out.println("Opção Inválida");
				
				break;
			}
		}
	}
	
	public static void cadastrarAluno() throws ParseException {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[9] == null) {
				if(alunos[i] == null) {
					System.out.println("Digite o nome do Aluno");
					String nome = s.next();
					
					System.out.println("Digite a data de nascimento do Aluno (EX: 01/01/1999)");
					String nasc = s.next();
				    Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nasc);
					
					int ra = i+1;
					
					alunos[i] = new Aluno(ra, nome, nascimento);
					
					System.out.println("__________________________");
					break;
				}
			} else {
				System.out.println("Limite Excedido");
				break;
			}
		}
	}
	
	public static void cadastrarNota() {
		
		System.out.println("Digite o RA do aluno cujo as notas serão cadastradas:");
		int ra = s.nextInt();
	    
	    float[] nota = new float[3];
	    
	    for (int i = 0; i < alunos.length; i++) {
	    	if (alunos[i] != null) {
	    		if(alunos[i].ra == ra) {
					Notas[] notas = alunos[i].notas;
					for (int j = 0; j < 4; j++) {
						if (notas[j] == null) {
							System.out.println("Aluno(a): " + alunos[i].nome + ". Possui " + j + "/4 componentes cadastrados.\n");
							
							System.out.println("Digite o nome da matéria para inserir as notas");
							String componente = s.next();
							
							for (int k = 0; k < 3; k++) {
								System.out.println("Digite a " + (k+1) + "ª Nota:");
								nota[k] = s.nextFloat();
							}
							
							notas[j] = new Notas(componente, nota);
							
							alunos[i].notas = notas;
							break;
						}
						if (j == 3) {
							System.out.println("Limite de componentes atingido para " + alunos[i].nome + ". (4/4)");
						}
					}
				}
			}
		}
	}
	
	public static void listarAlunos() {
		System.out.println("RA\tNome\tNascimento\tIdade");
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				System.out.println(alunos[i].ra + "\t" + alunos[i].nome + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(alunos[i].nascimento) + "\t" + alunos[i].calcIdade());
			}
		}
	}
	
	public static void listarNotas() {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				
				System.out.println(alunos[i].nome);
				
				System.out.println("\tComp.\tNota 1\tNota 2\tNota 3\tMédia\n");
				for (int j = 0; j < alunos[i].notas.length; j++) {
					System.out.print("\t" + alunos[i].notas[j].componente);
					for (int j2 = 0; j2 < alunos[i].notas[j].notas.length; j2++) {
						System.out.print("\t" + alunos[i].notas[j].notas[j2]);
					}
					if(alunos[i].notas[j].obterMedia() <= 50) {
						System.out.printf("\t|%.2f|", alunos[i].notas[j].obterMedia());
						System.out.println("\n");
					} else {
						System.out.printf("\t%.2f", alunos[i].notas[j].obterMedia());
						System.out.println("\n");
					}
				}
				System.out.println(alunos[i].obterConceito());
				System.out.println("\n");
			}
			
		}
	}
	
	public static Aluno obterAluno(int ra) {
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null && alunos[i].ra == ra) {
				return alunos[i];
			}
		}
		return null;
	}
	
	public static Aluno obterAluno(String nome) {
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null && alunos[i].nome.equals(nome)) {
				return alunos[i];
			}
		}
		return null;
	}

}
