package matrizes;


import java.util.Random;
import java.util.Scanner;

public class ExMatriz {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		int menu = 0;
		
		while(menu != 4) {
			System.out.println("Digite uma opção");
			System.out.println("1- Vetor\n2- Matriz 2x2\n3- Matriz 3x3\n4- Sair");
			menu = entrada.nextInt();
			
			switch (menu) {
			case 1:
				
				vetorRand();
				
				break;
			
			case 2:
				
				matriz2Rand();
				
				break;
				
			case 3:
				
				matriz3Rand();
				
				break;
				
			case 4:
				
				System.out.println("Tchau");
				
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}
		
		

	}
	
	public static void vetorRand() {
		Random rand = new Random();
		
		int[] nums = new int[27];
		
		System.out.println("Índice\tValor");
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(100);
			
			System.out.println(i + "\t" + nums[i]);
		}
	}
	
	public static void matriz2Rand() {
		Random rand = new Random();
		
		int[][] nums = new int[3][9];
		
		System.out.println("Índice\tValor");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				nums[i][j] = rand.nextInt(100);
				
				System.out.println("[" + i + "," + j + "]" + "\t" + nums[i][j]);
			}
		}
		
	}
	
	public static void matriz3Rand() {
		Random rand = new Random();
		
		int[][][] nums = new int[3][3][3];
		
		System.out.println("Índice\tValor");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					nums[i][j][j2] = rand.nextInt(100);
					
					System.out.println("[" + i + "," + j + "," + j2 + "]" + "\t" + nums[i][j][j2]);
				}
			}
			
		}
	}
	

}
