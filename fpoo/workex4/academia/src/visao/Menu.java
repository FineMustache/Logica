package visao;

import java.text.*;
import java.util.Date;
import java.util.Scanner;

import modelo.Aparelho;

public class Menu {
	
	private static Scanner scan = new Scanner(System.in);
	private static Aparelho[] aparelhos = new Aparelho[10];
	
	public static void main(String[] args) throws ParseException {
		int op = 0;
		
		while (op != 3) {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Veículo\t2 - Listar Veículos");
			op = scan.nextInt();
			
			switch (op) {
			case 1:
				cadastrarAparelho();
				break;
				
			case 2:
				listarAparelho();
				break;
				
			case 3:
				System.out.println("Valeu meu cria");
				break;
				
			default:
				System.out.println("Ta bobiano");
				break;
			}
		}

	}
	
	public static void cadastrarAparelho() throws ParseException {
		for (int i = 0; i < aparelhos.length; i++) {
			if (aparelhos[9] == null) {
				if(aparelhos[i] == null) {
					System.out.println("Digite o nome do aparelho");
					String nome = scan.next();
					
					System.out.println("Digite o tipo do exercício");
					String tipoExercicio = scan.next();
					
					System.out.println("Digite o grupo muscular");
					String grupoMuscular = scan.next();
					
					System.out.println("Digite a data de aquisição (dd/mm/aaaa)");
					String dataAq = scan.next();
					
					Date dataAquisicao = new SimpleDateFormat("dd/MM/yyyy").parse(dataAq);
					
					System.out.println("Digite o valor da aquisição do aparelho");
					double valorAquisicao = scan.nextDouble();
					
					aparelhos[i] = new Aparelho(nome, tipoExercicio, grupoMuscular, dataAquisicao, valorAquisicao);
					
					System.out.println("\n\nVeículo Cadastrado com SUCESSO!");
					break;
				}
			} else {
				System.out.println("Limite Excedido (10/10)");
			}
		}
	}
	
	private static void listarAparelho() {
		if (aparelhos[0] != null) {
			System.out.println("NOME\tTIPO\tG.M.\tDT AQ\tVL AQ");
			for (int i = 0; i < aparelhos.length; i++) {
			
				if (aparelhos[i] != null) {
					System.out.println(aparelhos[i].paraString());
				}
			}
		} else {
			System.out.println("Nenhum aparelho cadastrado\n\n");
		}
	}

}
