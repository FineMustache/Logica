package agenda;

import java.util.Scanner;

import agenda.Contato;

public class Agenda6 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Digite quantos contatos deseja cadastrar");
		int qtdCont = scan.nextInt();
		Contato[] contatos = new Contato[qtdCont];
		
		System.out.println("Id\tIdade\tIdade\tTelefone");
		for (int i = 0; i < qtdCont; i++) {
			contatos[i]= new Contato();
			contatos[i].id = scan.nextInt();
			contatos[i].nome = scan.nextLine();
			contatos[i].idade = scan.nextInt();
			contatos[i].telefone = scan.nextLine();
		}
		
		
		
	}

}
 