package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Produto;
import modelo.Venda;

public class DAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String pathProd =  "./dados/produtos.csv";
	private String pathVend =  "./dados/vendas.csv";
	
	public ArrayList<Produto> lerProd(){
		ArrayList<Produto> linhas = new ArrayList<Produto>();
		Produto produto;
		
		try {
			br = new BufferedReader(new FileReader(pathProd));
			String linha = br.readLine();
			while (linha != null) {
				produto = new Produto(linha);
				linhas.add(produto);
				linha = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return linhas;
	}
	
	public void escreverProd(ArrayList<Produto> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(pathProd));
			
			for (Produto p : linhas) {
				bw.write(p.toCSV() + "\r\n");
			}
			
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}	
	}
	
	public ArrayList<Venda> lerVenda(){
		ArrayList<Venda> linhas = new ArrayList<Venda>();
		Venda venda;
		
		try {
			br = new BufferedReader(new FileReader(pathVend));
			String linha = br.readLine();
			while (linha != null) {
				venda = new Venda(linha);
				linhas.add(venda);
				linha = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return linhas;
	}
	
	public void escreverVenda(ArrayList<Venda> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(pathVend));
			
			for (Venda v : linhas) {
				bw.write(v.toCSV() + "\r\n");
			}
			
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}