package exLacos;

import java.util.Scanner;

public class ExLacos {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int menu = 0;
		
		while (menu != 7) {
			
			System.out.println("1 - Números Pares\n2 - Números Ímpares\n3 - Maior Menor\n4 - Fatorial\n5 - Xerox\n6 - Soma Par e Impar\n7 - Sair");
			menu = s.nextInt();
			
			switch(menu) {
				
			case 1:
				
				System.out.println("Digite um valor de início:");
				double n1 = s.nextInt();
				
				System.out.println("Digite outro valor maior que o anterior:");
				int n2 = s.nextInt();
				
				System.out.println("");
				
				for(int i= (int) Math.round(n1/2) * 2; i < n2; i += 2){   
			        System.out.println(i);     
			      } 
				
				break;
			case 2:
				
				System.out.println("Digite um valor de início:");
				int vl1 = s.nextInt();
				
				System.out.println("Digite outro valor maior que o anterior:");
				int vl2 = s.nextInt();
				
				
				if(vl1 % 2 == 0) {
					vl1++;
				}
				
				for(int i = vl1; i < vl2; i += 2) {
					System.out.println(i);
				}
				
				break;
			case 3:
				
				int [] valores = new int[10];
				
				for(int i = 0; i < 10; i++) {
					System.out.println("Digite um valor:");
					valores[i] = s.nextInt();
				}
				
				int maior = valores[0], menor = valores[0];
				
				for(int i = 0; i < 10; i++) {
					if(valores[i] > maior)
						maior = valores[i];
				
					if(valores[i] < menor)
						menor = valores[i];
				}
				
				System.out.println("Maior número digitado é: " + maior);
				System.out.println("Maior número digitado é: " + menor);
				System.out.println("");
				
				break;
			case 4:
				
				System.out.println("Digite o número que deseja fatorar");
				double x = s.nextInt();
						
				double f = x;
				
				while (x > 1){ 
		             f = f *(x-1);
		             x--;
		             System.out.println(f);
		        }
				 
				System.out.println("\n");
				 
				break;
			case 5:
				
				System.out.println("Digite o valor do Xérox");
				
				double vl = s.nextDouble();
				
				System.out.println("\n\n");
				
				int cont = 1;
				
				for (int i = 0; i < 20; i++) {
					for (int j = 0; j < 10; j++) {
						System.out.printf("%d: %.2f |-| ", cont, vl*cont);
						cont++;
					}
					System.out.println();
				}
				
				break;
			case 6:
				
				int qtdeImp = 0;
				int qtdePar = 0;
				
				System.out.println("Digite um valor: ");
				int num1 = s.nextInt();
				
				System.out.println("Digite um valor maior que o anterior: ");
				int num2 = s.nextInt();
				
				for (int j = num1; j <= num2; j++) {
					
					if(j % 2 != 0) {
						
						qtdeImp += j;
						
					}
				}
				System.out.println("\nA soma dos valores ímpares é " + qtdeImp + "\n");
				
				for (int j = num1; j <= num2; j++) {
					
					if(j % 2 == 0) {
						
						qtdePar += j;
						
					}
				}
				
				System.out.println("\nA soma dos valores pares é " + qtdePar + "\n");
				
				break;
				
			case 7:
				
				System.out.println("Adeus :)");
				break;
				
			default:
				System.out.println("Digite outro número");
			}
		}

	}

}
