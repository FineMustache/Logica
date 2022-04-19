package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

	public void escrever(String info, String fileName, boolean append) {
		
		try {
			FileWriter fw = new FileWriter(fileName + ".txt", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(info + "\r\n");
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private ArrayList<String> ler (String fileName){
		ArrayList<String> data = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(fileName + ".txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				data.add(linha);
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return data;
	}
	
	public boolean validarSenha(String login, String senha) {
		ArrayList<String> contas = this.ler("Contas");
		
		boolean valida = false;
		
		for (String conta : contas) {
			String[] temp = conta.split(";");
			
			if(temp[0].equals(login) && temp[1].equals(senha)) {
				valida = true;
				break;
			} else {
				valida = false;
			}
		}
		
		return valida;
	}
	
	public String getNome(String login) {
		ArrayList<String> contas = this.ler("Contas");
		
		for (String conta : contas) {
			String[] temp = conta.split(";");
			
			if(temp[0].equals(login)) {
				return temp[2];
			}
		}
		
		return null;
	}
	
	public String toString(String login) {
		ArrayList<String> contas = this.ler("Contas");
		
		for (String conta : contas) {
			String[] temp = conta.split(";");
			
			if(temp[0].equals(login)) {
				return temp[0] + ";" + temp[1] + ";" + temp[2];
			}
		}
		
		return null;
	}
	
	public boolean validarLogin(String login) {
		ArrayList<String> contas = this.ler("Contas");
		
		boolean valida = false;
		
		for (String conta : contas) {
			String[] temp = conta.split(";");
			
			if(temp[0].equals(login)) {
				valida = false;
				break;
			} else {
				valida = true;
				
			}
		}
		
		return valida;
	}
	
	public boolean deletarConta(String login) throws IOException {
		
		if (!this.validarLogin(login)) {
			File arqPrincipal = new File("Contas.txt");
			File arqTemp = new File("ContasTemp.txt");
			
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(arqPrincipal));
			} catch (FileNotFoundException e) {
				System.out.println(e.toString());
			}
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter(arqTemp));
			} catch (IOException e) {
				System.out.println(e.toString());
			}

			String linha = this.toString(login);
			String linhaAtual;

			while((linhaAtual = reader.readLine()) != null) {
			    String linhaCortada = linhaAtual.trim();
			    if(!linhaCortada.equals(linha)) {
			    	writer.write(linhaAtual + "\r\n");
			    }
			}
			writer.close(); 
			reader.close();
			
			arqPrincipal.delete();
			
			return arqTemp.renameTo(arqPrincipal);
		} else {
			return false;
		}
		
		
	}
}
