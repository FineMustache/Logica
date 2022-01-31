package modelo;

import java.util.Scanner;

public class Media {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite um valor:");
		num1 = entrada.nextDouble();
		System.out.println("Digite outro valor:");
		num2 = entrada.nextDouble();
		
		float media;
		media = (float) ((num1+num2)/2);
		
		if(media > 5) {
			System.out.println("O aluno foi APROVADO com média igual a " + media);
		} else {
			System.out.println("O aluno foi REPROVADO com média igual a " + media);
		}

	}

}
