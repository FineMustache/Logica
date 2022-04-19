package modelo;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
import java.util.Scanner;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	private static String body = "";
	public static void main(String[] args) throws IOException {
		
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção");
			System.out.println("1 - Adicionar título\t2 - Adicionar subtítulo\t3 - Adicionar Parágrafo\t4 - Gerar HTML\n5 - Cancelar\n0 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				addTitulo();
				break;
			
			case 2:
				addSubtitulo();
				break;
				
			case 3:
				addParagrafo();
				break;
				
			case 4:
				gerarHtml();
				break;
				
			case 5:
				body = "";
				System.out.println("Código resetado");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while (menu != 0 || menu != 4);
		
	}
	
	private static void addTitulo() {
		System.out.println("Digite o conteúdo do seu título");
		s.nextLine();
		body = body + "\r\n<h1>" + s.nextLine() + "</h1>";
		
		System.out.println("Titulo adicionado");
		
	}
	
	private static void addSubtitulo() {
		System.out.println("Digite o conteúdo do seu subtítulo");
		s.nextLine();
		body = body + "\r\n<h3>" + s.nextLine() + "</h3>";
		
		System.out.println("Subtitulo adicionado");
		
	}
	
	private static void addParagrafo() {
		System.out.println("Digite o conteúdo do seu paragrafo");
		s.nextLine();
		body = body + "\r\n<p>" + s.nextLine() + "</p>";
		
		System.out.println("Paragrafo adicionado");
		
	}
	
	private static void gerarHtml() throws IOException {
		String html = "<html>\r\n<body>\r\n" + body + "\r\n</body>\r\n</html>";
		arq.escrever(html, "index", false);
		
		System.out.println("Arquivo gerado!");
		
		int op = 0;
		
		do {
			System.out.println("Deseja abrir o arquivo?\n1 - Sim\t2 - Não");
			op = s.nextInt();
			
			switch (op) {
			case 1:
				File index = new File("index.html");
				Desktop desktop = Desktop.getDesktop();
				desktop.open(index);
				break;
				
			case 2:
				break;
			default:
				System.out.println("Inválida");
				break;
			}
		} while (op != 1 && op != 2);
	}
}
