package visao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.Aparelho;
import modelo.Veiculo;

public class Menu {
	
	private static Scanner scan = new Scanner(System.in);
	private static Aparelho[] aparelhos = new Aparelho[10];
	
	public static void main(String[] args) {
		int op = 0;
		
		while (op != 3) {
			System.out.println("Digite uma op��o");
			System.out.println("1 - Cadastrar Ve�culo\t2 - Listar Ve�culos");
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
	
	public static void cadastrarAparelho() {
		for (int i = 0; i < aparelhos.length; i++) {
			if (aparelhos[9] == null) {
				if(aparelhos[i] == null) {
					System.out.println("Digite o nome do aparelho");
					String nome = scan.next();
					
					System.out.println("Digite o tipo do exerc�cio");
					String tipoExercicio = scan.next();
					
					System.out.println("Digite o grupo muscular");
					String grupoMuscular = scan.next();
					
					System.out.println("Digite a data de aquisi��o (dd/mm/aaaa)");
					String dataAq = scan.next();
					
					Date dataAquisicao = new SimpleDateFormat("dd/MM/yyyy").parse(dataAq);
					
					System.out.println("Digite o ano de fabrica��o do ve�culo");
					int anoFabricacao = scan.nextInt();
					
					System.out.println("Digite a cor do ve�culo");
					String cor = scan.next();
					
					aparelhos[i] = new Aparelho(placa, marca, modelo, anoModelo, anoFabricacao, cor);
					
					System.out.println("\n\nVe�culo Cadastrado com SUCESSO!");
					break;
				}
			} else {
				System.out.println("Limite Excedido (10/10)");
			}
		}
	}

}
