package inventario;

import java.util.Random;
import java.util.Scanner;

public class CadastroBens {
	
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	static String[] descs = {"Carro", "Casa", "Moto", "Ap.", "Relógio", "Celular", "Empresa"};
	public static void main(String[] args) {
		System.out.println("Quantos bens deseja cadastrar?");
		int qtdBens = s.nextInt();
		Bem[] bens = new Bem[qtdBens];
		for (int i = 0; i < qtdBens; i++) {
			bens[i] = new Bem(i+1, descs[r.nextInt(descs.length)], r.nextDouble()*100000);
		}
	}
	
	public static class Bem{
		public int id;
		public String descricao;
		public double valor;
		
		Bem() {}
		
		Bem(int id, String descricao, double valor){
			this.id = id;
			this.descricao = descricao;
			this.valor = valor;
			
		}
		
		public String bemTab() {
			return id+"\t"+descricao+"\t"+String.format("R$%.2f", valor);
		}
	}
}
