package classicos;

import java.util.Iterator;
import java.util.Random;

public class Acumula {

	public static void main(String[] args) {
		System.out.println("O algoritmo de acumulação");
		System.out.print("simples, retornou = ");
		System.out.println(simples(10));
		
		System.out.print("aleatório, retornou = ");
		System.out.println(aleatorio(10));
		
		System.out.print("\n\nfatorial, retornou = ");
		System.out.println(fatorial(5));

	}
	
	public static int simples(int iteracoes) {
		int x = 0;
		for (int i = 0; i < iteracoes; i++) 
			x++;
			
		return x;
	}
	
	public static int aleatorio(int iteracoes) {
		Random rand = new Random();
		int x = 0;
		int r = 0;
		for (int i = 0; i < iteracoes; i++) {
			r = rand.nextInt(100);
			
			System.out.println("Aleatório = " + r);
			
			x+=r;
			
			System.out.println("Acumulando = " + x);
		}
			
		return x;
	}
	
	public static long fatorial(int num) {
		long fat = 1;
		for (int i = 2; i <= num; i++) {
			fat *= i;
			
		}
		
		return fat;
	}
	

}
