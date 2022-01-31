package exercicios;

import java.time.Year;
import java.util.Scanner;

public class Nascimento {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int ano = Year.now().getValue();
		
		System.out.print("Digite seu ano de nascimento: ");
		int nasc = entrada.nextInt();
		
		System.out.println("Você já fez aniversário esse ano? (S ou N)");
		String resp = entrada.next();
		if(resp == "S" || resp == "s") {
			
		}
		
		int idade = ano - nasc;
		
		if(idade >= 18) {
			System.out.println("Com " + idade + " anos, você é maior de idade!");
		} else {
			System.out.println("Com " + idade + " anos, você é menor de idade!");
		}

	}

}
