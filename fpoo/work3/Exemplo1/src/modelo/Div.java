package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Div {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int val1, val2, result;
		
		System.out.print("Digite um valor inteiro: ");
		val1 = entrada.nextInt();
		
		System.out.print("Digite outro valor inteiro: ");
		val2 = entrada.nextInt();
		
		if (val2 == 0) {
			System.out.println("O segundo valor não pode ser 0");
		} else {
			result = val1 / val2;
			
			System.out.println(val1 + " ÷ " + val2 + " = " + result);
		}
		
	}

}