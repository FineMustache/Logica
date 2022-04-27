package main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	public static void main(String[] args) {
		
		int menu = 0;
				
		do {
			System.out.println("1 - Soma\t2 - Mult\t3 - Subtração\t4 - Div\t5 - Segredo\t0 - Sair");
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				
				soma();
				
				break;
				
			case 2:
				
				mult();
				
				break;
				
			case 3:
				
				subtracao();
				
				break;
				
			case 4:
				
				div();
				
				break;
				
			case 0:
				
				System.out.println("tchau");
				
				break;
				
			default:
				
				System.out.println("bobiou");
				
				break;
			}
			
		} while (menu != 0);

	}
	
	private static void soma() {
		ArrayList<String> fileInfo = arq.ler("Entrada");
		
		String saida = "";
		
		for (String linha : fileInfo) {
			String[] temp = linha.split(";");
			
			saida = saida + (Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])) + "\r\n";
		}
		
		arq.escrever(saida, "Saida", false);
		
		System.out.println("AAAAAAA");
	}
	
	private static void mult() {
		ArrayList<String> fileInfo = arq.ler("Entrada");
		
		String saida = "";
		
		for (String linha : fileInfo) {
			String[] temp = linha.split(";");
			
			saida = saida + (Integer.parseInt(temp[0]) * Integer.parseInt(temp[1])) + "\r\n";
		}
		
		arq.escrever(saida, "Saida", false);
		
		System.out.println("AAAAAAA");
	}
	
	private static void subtracao() {
		ArrayList<String> fileInfo = arq.ler("Entrada");
		
		String saida = "";
		
		for (String linha : fileInfo) {
			String[] temp = linha.split(";");
			
			saida = saida + (Integer.parseInt(temp[0]) - Integer.parseInt(temp[1])) + "\r\n";
		}
		
		arq.escrever(saida, "Saida", false);
		
		System.out.println("AAAAAAA");
	}
	
	private static void div() {
		ArrayList<String> fileInfo = arq.ler("Entrada");
		
		String saida = "";
		
		for (String linha : fileInfo) {
			String[] temp = linha.split(";");
			
			saida = saida + new DecimalFormat("0.00").format(Double.parseDouble(temp[0]) / Double.parseDouble(temp[1])) + "\r\n";
		}
		
		arq.escrever(saida, "Saida", false);
		
		System.out.println("AAAAAAA");
	}
}
