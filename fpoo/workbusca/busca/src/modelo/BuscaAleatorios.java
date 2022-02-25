package modelo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BuscaAleatorios {
	
	static Random r = new Random();
	
	static Scanner entrada;
	public static void main(String[] args) throws IOException {
		entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos números deseja");
		
		int[] dados = numerosAleatorios(entrada.nextInt());
		
		System.out.println("Digite o número que deseja buscar");
		
		buscaNumero(entrada.nextInt(), dados);

	}

	public static void mostrarNumeros(int[] dados) {
		System.out.println("Índice\tValor");
		for (int i = 0; i < dados.length; i++) {
			System.out.println(i + "\t" + dados[i]);
		}
		
	}

	public static int[] numerosAleatorios(int n) {
		
		
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = r.nextInt(1000);
		}
		
		return x;
	}
	
	
	public static void buscaNumero(int b, int[] dados) {
		
		boolean encontrado = false;
		int index = -1;
		
		for (int i = 0; i < dados.length; i++) {
			if(dados[i] == b) {
				encontrado = true;
				break;
			}
			
		}
		
		
		mostrarNumeros(dados);
		
		if(!encontrado) {
			System.out.println("Sem sucesso");
		}else {
			System.out.println("Sucesso!");
			for (int i = 0; i < dados.length; i++) {
				if (dados[i] == b) {
					System.out.println("Índice\tValor");
					System.out.println(i + "\t" + dados[i]);
				}
			}
		}
		
	}
}
