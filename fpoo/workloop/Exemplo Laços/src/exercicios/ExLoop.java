package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class ExLoop {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		int menu = 0;
		while(menu != 11) {
			System.out.println("Digite uma opção:");
			System.out.println("1- Programa 1\n2- Programa 2");
			System.out.println("3- Programa 3\n4- Programa 4");
			System.out.println("5- Programa 1\n6- Programa 6");
			System.out.println("7- Programa 1\n8- Programa 8");
			System.out.println("9- Programa 1\n10- Programa 10");
			System.out.println("11- Sair");
			menu = entrada.nextInt();
			
			switch(menu) {
			
			case 1:
				System.out.println("Programa que imprime os valores no intervalo entre 10 e 200\n");
				for (int i = 10; i <= 200; i++) {
					System.out.println(i);
				}
				break;
				
			case 2:
				System.out.println("Programa que imprime os valores no intervalo entre 200 e 1\n");
				for (int i = 200; i > 0; i--) {
					System.out.println(i);
				}
				break;
				
			case 3:
				System.out.println("Programa que imprime os valores entre 0 e o valor digitado\n");
				System.out.println("Digite um valor inteiro:");
				int valor = entrada.nextInt();
				
				if (valor < 0) {
					for (int i = 0; i >= valor; i--) {
						System.out.println(i);
					}
				} else {
					for (int i = 0; i <= valor; i++) {
						System.out.println(i);
					}
				}
				break;
				
			case 4:
				System.out.println("Programa que imprime os valores entre os valores digitados\n");
				
				System.out.println("Digite um valor inteiro:");
				int n1 = entrada.nextInt();
				
				System.out.println("Digite outro valor inteiro:");
				int n2 = entrada.nextInt();
				
				if (n1 < n2) {
					for (int i = n1; i <= n2; i++) {
						System.out.println(i);
					}
				} else {
					for (int i = n2; i <= n1; i++) {
						System.out.println(i);
					}
				}
				break;
				
			case 5:
				System.out.println("Programa que imprime todos os numeros pares entre os valores digitados\n");
				
				System.out.println("Digite um valor inteiro:");
				int num1 = entrada.nextInt();
				
				System.out.println("Digite outro valor inteiro:");
				int num2 = entrada.nextInt();
				
				if (num1 < num2) {
					for (int i = num1; i <= num2; i++) {
						if(i % 2 == 0) {
							System.out.println(i);
						}
					}
				} else {
					for (int i = num2; i <= num1; i++) {
						if(i % 2 == 0) {
							System.out.println(i);
						}
					}
				}
				break;
				
			case 6:
				System.out.println("Programa que imprime a soma dos valores entre 0 e 100\n");
				int soma = 0; 
				for(int i = 0; i <= 100 ; i++) {
					soma += i;
				}
				
				System.out.println(soma);
				break;
				
			case 7:
				System.out.println("Programa que imprime a soma dos valores entre os valores digitados\n");
				int sum = 0;
				
				System.out.println("Digite um valor inteiro:");
				int vl1 = entrada.nextInt();
				
				System.out.println("Digite outro valor inteiro:");
				int vl2 = entrada.nextInt();
				
				if (vl1 < vl2) {
					for (int i = vl1; i <= vl2; i++) {
						sum += i;
					}
				} else {
					for (int i = vl2; i <= vl1; i++) {
						sum += i;
					}
				}
				
				System.out.println(sum);
				break;
				
			case 8:
				System.out.println("Programa que imprime a soma dos valores pares entre os valores digitados\n");
				int add = 0;
				
				System.out.println("Digite um valor inteiro:");
				int valor1 = entrada.nextInt();
				
				System.out.println("Digite outro valor inteiro:");
				int valor2 = entrada.nextInt();
				
				if (valor1 < valor2) {
					for (int i = valor1; i <= valor2; i++) {
						if(i % 2 == 0) {
							add += i;
						}
					}
				} else {
					for (int i = valor2; i <= valor1; i++) {
						if(i % 2 == 0) {
							add += i;
						}
					}
				}
				
				System.out.println(add);
				break;
				
			case 9:
				System.out.println("Programa que exibe a soma de 15 valores\n");
					
				System.out.println("Digite um valor inteiro:");
				int a = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int b = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int c = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int d = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int e = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int f = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int g = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int h = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int ii = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int j = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int k = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int l = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int m = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int n = entrada.nextInt();
				
				System.out.println("Digite um valor inteiro:");
				int o = entrada.nextInt();
				
				int plus = a+b+c+d+e+f+g+h+ii+j+k+l+m+n+o;
				
				System.out.println(plus);
				break;
				
			case 10:
				System.out.println("Programa que exibe os numeros pares entre 11 e 250 em ordem crescente\n");
				
				for(int i = 11; i <= 250; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
				break;
				
			case 11:
				System.out.println("Tchau.");
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
			
		}
	}
}
