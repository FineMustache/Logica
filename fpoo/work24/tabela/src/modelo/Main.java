package modelo;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.awt.Desktop;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	private static Html table = new Html();
	public static void main(String[] args) throws IOException {
		
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Produto\t2 - Gerar Tabela\n0 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				cadastrar();
				break;
			
			case 2:
				gerarHtml();
				break;
				
			case 0:
				System.out.println("Vlw Flw");
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while (menu != 0);
		
	}
	
	private static void cadastrar() {
		System.out.println("Digite o id do produto");
		String id = s.next();
		
		System.out.println("Digite o nome do produto");
		s.nextLine();
		String nome = s.nextLine();
		
		System.out.println("Digite a descrição do produto");
		String desc = s.nextLine();
		
		System.out.println("Digite o preço do produto");
		String preco = "R$ " + new DecimalFormat("0.00").format(s.nextDouble());
		
		String data = id + ";" + nome + ";" + desc + ";" + preco;
		
		arq.escrever(data, "Produtos", true);
		
		System.out.println("Produto Cadastrado!");
	}
	
	private static void gerarHtml() throws IOException {
		ArrayList<String> produtos = arq.ler("Produtos");
		String body = "";
		for (String produto : produtos) {
			String[] temp = produto.split(";");
			
			body = body + "\r\n<tr>\r\n<td>" + temp[0] + "</td>\r\n<td>" + temp[1] + "</td>\r\n<td>" + temp[2] + "</td>\r\n<td>" + temp[3] + "</td>\r\n</tr>";
		}
		
		String html = "<html>\r\n<body>\r\n<table border=1>\r\n<tr><th colspan='4'>Produtos</th></tr>\r\n<tr>\r\n<th>Id</th>\r\n<th>Nome</th>\r\n<th>Descrição</th>\r\n<th>preco</th>\r\n</tr>\r\n" + body + "\r\n</table>\r\n</body>\r\n</html>";
		table.escrever(html, "index", false);
		
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
