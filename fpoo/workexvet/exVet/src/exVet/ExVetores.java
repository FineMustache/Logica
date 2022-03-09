package exVet;

import java.util.Arrays;
import java.util.Scanner;

public class ExVetores {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int menu = 0;
		
		while (menu != 8) {
			System.out.println("\n\nDigite uma op��o");
			System.out.println("1 - Vetor ida e volta\n2 - Vetores espelhados\n3 -  Vetor modificado\n4 - Busca por nome\n5 - Vetores de 20\n6 - Organizando Pares e Impares\n7 - Vetores iguais\n8 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				int[] nums =  new int[10];
				
				for (int i = 0; i < nums.length; i++) {
					System.out.println("Digite um n�mero inteiro");
					nums[i] = s.nextInt();
				}
				
				System.out.println("\n\nOrdem normal:");
				
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i] + " ");
				}
				
				System.out.println("\n\nOrdem inversa:");
				
				for (int i = nums.length - 1; i >= 0 ; i--) {
					System.out.print(nums[i] + " ");
				}
				
				break;
				
			case 2:
				
				int[] nums1 =  new int[10];
				int[] nums2 =  new int[10];
				
				for (int i = 0; i < nums1.length; i++) {
					System.out.println("Digite um n�mero inteiro");
					nums1[i] = s.nextInt();
				}
				
				for (int i = nums1.length - 1; i >= 0 ; i--) {
					nums2[9-i] = nums1[i];
				}
				
				System.out.println("\nVetor 1:");
				
				for (int i = 0; i < nums1.length; i++) {
					System.out.print(nums1[i] + " ");
				}
				
				System.out.println("\nVetor 2:");
				
				for (int i = 0; i < nums2.length; i++) {
					System.out.print(nums2[i] + " ");
				}
				
				break;
				
			case 3:
				
				int[] valores1 = new int[10];
				double[] valores2 = new double[10];
				
				for (int i = 0; i < valores1.length; i++) {
					do {
						System.out.println("Digite um n�mero inteiro e positivo:");
						valores1[i] = s.nextInt();
						
						if (valores1[i] <= 0) {
							System.out.println("N�mero inv�lido");
						}
					} while(valores1[i] <= 0);
				}
				
				for (int i = 0; i < valores1.length; i++) {
					if (i % 2 == 0) {
						valores2[i] = (double) valores1[i] / 2;
					} else {
						valores2[i] = (double) valores1[i] * 3;
					}
				}
				
				System.out.println("\nVetor 1:");
				
				for (int i = 0; i < valores1.length; i++) {
					System.out.print(valores1[i] + " ");
				}
				
				System.out.println("\nVetor 2:");
				
				for (int i = 0; i < valores2.length; i++) {
					System.out.print(valores2[i] + " ");
				}
				
				break;
				
			case 4:
				
				String[] c = new String[10];
				
				for (int i = 0; i < c.length; i++) {
					System.out.println("Digite um nome");
					c[i] = s.next();
				}
				
				System.out.println("\nDigite um nome para ser buscado");
				String nome = s.next();
				boolean achou = false;
				for (int i = 0; i < c.length; i++) {
					if (c[i].equals(nome)) {
						System.out.println("ACHEI");
						achou = true;
					}
				}
				
				if (!achou) {
					System.out.println("N�O ACHEI");
				}
				
				break;
				
			case 5:
				
				int[] v1 = new int[20];
				int[] v2 = new int[20];
				int[] v3 = new int[20];
				int[] v4 = new int[20];
				int[] v5 = new int[20];
				
				System.out.println("Vetor 1:");
				
				for (int i = 0; i < 20; i++) {
					System.out.println("Digite um n�mero inteiro");
					v1[i] = s.nextInt();
				}
				
				System.out.println("\nVetor 2:");
				
				for (int i = 0; i < 20; i++) {
					System.out.println("Digite um n�mero inteiro");
					v2[i] = s.nextInt();
				}
				
				
				
				System.out.println("\nVetor 3:");
				
				for (int i = 0; i < 20; i++) {
					
					v3[i] = v2[i] - v1[i];
					System.out.print(v3[i] + " ");
				}
				
				System.out.println("\nVetor 4:");
				
				for (int i = 0; i < 20; i++) {
					
					v4[i] = v2[i] + v1[i];
					System.out.print(v4[i] + " ");
				}
				
				System.out.println("\nVetor 5:");
				
				for (int i = 0; i < 20; i++) {
					
					v5[i] = v2[i] * v1[i];
					System.out.print(v5[i] + " ");
				}
				
				break;
				
			case 6:
				
				System.out.println("Digite quantos n�meros deseja inserir no vetor");
				int qtde = s.nextInt();
				
				int[] vec = new int[qtde];
				
				int qtdeImp = 0, qtdePar = 0;
				
				for (int i = 0; i < vec.length; i++) {
					System.out.println("Digite um n�mero");
					vec[i] = s.nextInt();
					
					if(vec[i] % 2 == 0) {
						qtdePar++;
					} else {
						qtdeImp++;
					}
				}
				
				int[] imp = new int[qtdeImp];
				int[] par = new int[qtdePar];
				
				for (int i = 0; i < par.length; i++) {
					par[i] = 1;
				}
				
				for (int i = 0; i < imp.length; i++) {
					imp[i] = 0;
				}
				
				for (int i = 0; i < vec.length; i++) {
					if(vec[i] % 2 == 0) {
						for (int j = 0; j < par.length; j++) {
							if(par[j] == 1) {
								par[j] = vec[i];
								break;
							}
						}
					} else {
						for (int j = 0; j < imp.length; j++) {
							if(imp[j] == 0) {
								imp[j] = vec[i];
								break;
							}
						}
					}
				}
				
				Arrays.sort(par);
				Arrays.sort(imp);
				
				System.out.println("Pares:");
				
				for (int i = 0; i < par.length; i++) {
					System.out.print(par[i] + " ");
				}
				
				System.out.println("\n\nImpares:");
				
				for (int i = imp.length - 1; i >= 0; i--) {
					System.out.print(imp[i] + " ");
				}
				
				break;
				
			case 7:
				
				System.out.println("Digite o tamanho dos vetores:");
				int qtd = s.nextInt();
						
				int[] vec1 = new int[qtd];
				int[] vec2 = new int[qtd];
				
				System.out.println("Vetor 1\n");
				
				for (int i = 0; i < vec2.length; i++) {
					System.out.println("Digite um n�mero:");
					vec1[i] = s.nextInt();
				}
				
				System.out.println("\n\nVetor 2\n");
				
				for (int i = 0; i < vec2.length; i++) {
					System.out.println("Digite um n�mero:");
					vec2[i] = s.nextInt();
				}
				
				boolean iguais = false;
				
				for (int i = 0; i < vec2.length; i++) {
					if(vec1[i] == vec2[i]) {
						iguais = true;
					} else {
						iguais = false;
						break;
					}
				}
				
				if (iguais) {
					System.out.println("S�o IGUAIS");
				} else {
					System.out.println("S�o DIFERENTES");
				}
				
				break;
				
			case 8:
				System.out.println("Adeus :)");
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
			
		}
	}

}
