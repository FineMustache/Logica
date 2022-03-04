package agenda;

import java.util.Scanner;
import agenda.Contato;

public class Main {
	
	static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Quantos contatos deseja cadastrar?");
		int qtdeCont = s.nextInt();
		
		Contato[] contatos = new Contato[qtdeCont];
		
		for (int i = 0; i < contatos.length; i++) {
			
			System.out.println("Digite o nome do Contato");
			String nome = s.next();
			
			System.out.println("Digite a idade do Contato");
			int idade = s.nextInt();
			
			System.out.println("Digite o telefone do Contato");
			String tel = s.next();
			
			int id = i+1;
			
			contatos[i] = new Contato(id, nome, idade, tel);
			
			System.out.println("__________________________");
		}
		
		int menu = 0;
		
		
		
		while(menu != 5) {
			System.out.println("Digite uma Opção");
			System.out.println("1.Mostrar Todos\t\t2.Buscar por Id\n3.Buscar por Nome\t\t4.Buscar por Telefone\n5.Sai");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				
				System.out.println("ID\t\tNome\t\tIdade\t\tTel");
				
				for (int i = 0; i < contatos.length; i++) {
					System.out.println(contatos[i].contatoTab());
				}
				
				break;
				
			case 2:
				
				System.out.println("Digite o ID");
				int id = s.nextInt();
				
				System.out.println("ID\t\tNome\t\tIdade\t\tTel");
				
				for (int i = 0; i < contatos.length; i++) {
					if(contatos[i].id == id) {
						System.out.println(contatos[i].contatoTab());
					}
				}
				
				break;
				
			case 3:
				
				System.out.println("Digite o Nome");
				String nome = s.nextLine();
				
				System.out.println("ID\t\tNome\t\tIdade\t\tTel");
				
				for (int i = 0; i < contatos.length; i++) {
					if(contatos[i].nome == nome) {
						System.out.println(contatos[i].contatoTab());
					}
				}
				
				break;
				
			case 4:
				
				System.out.println("Digite o Telefone");
				String tel = s.next();
				
				System.out.println("ID\t\tNome\t\tIdade\t\tTel");
				
				for (int i = 0; i < contatos.length; i++) {
					if(contatos[i].telefone == tel) {
						System.out.println(contatos[i].contatoTab());
					}
				}
				
				break;
				
			case 5:
				
				System.out.println("Falou");
				break;
				
			default:
				
				System.out.println("Opção Inválida");
				break;
			}

		}
	}
}
