package modelo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	private static String session = ""; 
	public static void main(String[] args) throws IOException {
		int menu = 0;
		
		do {
			
			if (session == "") {
				do {
					
					if (session != "") {
						break;
					}
					
					System.out.println("Digite uma opção");
					System.out.println("1 - Cadastrar\t2 - Fazer Login\t0 - Sair");
					menu = s.nextInt();
					
					switch (menu) {
					case 1:
						cadastrar();
						break;
						
					case 2:
						logar();
						break;
						
					case 0:
						System.out.println("vlw flw");
						break;
					default:
						System.out.println("Bobiou");
						break;
					}
					
				} while (menu != 0);
			} if(session.equals("admin")) {
				do {
					
					System.out.println("Digite uma opção");
					System.out.println("1 - Cadastrar Conta\t2 - Excluir Conta\t3 - Logoff");
					menu = s.nextInt();
					
					switch (menu) {
					case 1:
						cadastrar();
						break;
						
					case 2:
						deletar();
						break;
						
					case 3:
						session = "";
						break;
					default:
						System.out.println("bobiou");
						break;
					}
					
				} while (menu != 3);
			} else if (!session.equals("")) {
				do {
					System.out.println("Digite uma opção");
					System.out.println("1 - Logoff");
					menu = s.nextInt();
					
					switch (menu) {
					case 1:
						session = "";
						break;
	
					default:
						System.out.println("Bobiou");
						break;
					}
				} while (menu != 1);
			}
		} while (menu != 0);
	}
	
	private static void cadastrar() {
		String login = "";
		do {
			System.out.println("Digite seu login");
			login = s.next();
			
			if(!arq.validarLogin(login)) {
				System.out.println("Login já existe, escolhe outro noia\n");
			}
		} while (!arq.validarLogin(login));
		
		System.out.println("Digite sua senha meu");
		String senha = s.next();
		
		System.out.println("Digite seu nome aí meu");
		s.nextLine();
		String nome = s.nextLine();
		
		String data = login + ";" + senha + ";" + nome;
		
		arq.escrever(data, "Contas", true);
		
	}
	
	private static void logar() {
		do {
			
			System.out.println("Digite seu Login");
			String login = s.next();
			
			System.out.println("Digite sua senha");
			String senha = s.next();
			
			if (arq.validarSenha(login, senha)) {
				session = login;
				
				System.out.println("Bem vindo, " + arq.getNome(session));
			} else {
				System.out.println("Credenciais Inválidas, tente novamente");
			}
			
			
			
		} while (session == "");
	}
	
	private static void deletar() throws IOException {
		System.out.println("Digite o login da conta que deseja jantar no murro");
		String login = s.next();
		
		if (arq.deletarConta(login)) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Algo de errado nao esta certo");
		}
	}
	
}
