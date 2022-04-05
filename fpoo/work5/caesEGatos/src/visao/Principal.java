package visao;

import java.util.Scanner;

import modelo.Cao;
import modelo.Gato;

public class Principal {
	
	private static Scanner s = new Scanner(System.in);
	private static Cao[] caes = new Cao[10];
	private static Gato[] gatos = new Gato[10];
	public static void main(String[] args) {
		int menu = 0;
		
		while (menu != 5) {
			System.out.println("Digite uma opção");
			System.out.print("1 - Cadastrar Cão\t2 - Cadastrar Gato\n3 - Listar Cães\t4 - Listar Gatos\n5 - Sair\n\nR: ");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				
				cadastrarCao();
				break;
				
			case 2:
				cadastrarGato();
				break;
				
			case 3:
				listarCaes();
				break;
				
			case 4:
				listarGatos();
				break;
				
			case 5:
				System.out.println("Falou <3");
				break;
				
			default:
				
				System.out.println("Ta bobiano");
				break;
			}
		}
	}
	
	private static void cadastrarCao() {
		if(caes[9] == null) {
			for (int i = 0; i < caes.length; i++) {
				if(caes[i] == null) {
					System.out.print("\nDigite a Espécie do Cão: ");
					String especie = s.next();
					
					System.out.print("\n\nDigite o Nome do Cão: ");
					String nome = s.next();
					
					System.out.print("\n\nDigite o Peso do Trutinha: ");
					float peso = s.nextFloat();
					
					System.out.print("\n\nDigite a Raça do Dog: ");
					String raca = s.next();
					
					System.out.print("\n\nDigite o Numero de Motoqueiros Atacados: ");
					int qtdMotoqueirosAtacados = s.nextInt();
					
					caes[i] = new Cao(qtdMotoqueirosAtacados, especie, nome, peso, raca);
					
					break;
				}
			}
		} else {
			System.out.println("CANIL TA CHEIO MEU TRUTA");
		}
	}
	
	private static void cadastrarGato() {
		if(gatos[9] == null) {
			for (int i = 0; i < gatos.length; i++) {
				if(gatos[i] == null) {
					System.out.print("\nDigite a Espécie do Gato: ");
					String especie = s.next();
					
					System.out.print("\n\nDigite o Nome do Gato: ");
					String nome = s.next();
					
					System.out.print("\n\nDigite o Peso do Bichano: ");
					float peso = s.nextFloat();
					
					System.out.print("\n\nDigite a Raça do Cat: ");
					String raca = s.next();
					
					System.out.print("\n\nDigite o Numero de Vidas Restantes: ");
					int qtdVidas = s.nextInt();
					
					gatos[i] = new Gato(qtdVidas, especie, nome, peso, raca);
					
					break;
				}
			}
		} else {
			System.out.println("GATIL TA CHEIO MEU TRUTA");
		}
		
	}
	
	private static void listarCaes() {
		if(caes[0] != null) {
			System.out.println("ESPECIE\tNOME\tPESO\tRAÇA\tMOTOQUEIROS");
			for (int i = 0; i < caes.length; i++) {
				if(caes[i] != null) {
					System.out.println(caes[i].toString());
				}
				
			}
		} else {
			System.out.println("Nenhum cão na rua");
		}
		
	}
	
	private static void listarGatos() {
		if(gatos[0] != null) {
			System.out.println("ESPECIE\tNOME\tPESO\tRAÇA\tVIDAS");
			for (int i = 0; i < gatos.length; i++) {
				if(gatos[i] != null) {
					System.out.println(gatos[i].toString());
				}
				
			}
		} else {
			System.out.println("Nenhum gato na rua");
		}
		
	}
}