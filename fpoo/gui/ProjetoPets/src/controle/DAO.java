package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Pet;

public class DAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String path =  "./dados/pets.csv";
	
	public ArrayList<Pet> ler(){
		ArrayList<Pet> linhas = new ArrayList<Pet>();
		Pet pet;
		
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while (linha != null) {
				pet = new Pet(linha);
				linhas.add(pet);
				linha = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return linhas;
	}
	
	public void escrever(ArrayList<Pet> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(path));
			
			for (Pet p : linhas) {
				bw.write(p.toCSV() + "\r\n");
			}
			
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}	
	}
}
