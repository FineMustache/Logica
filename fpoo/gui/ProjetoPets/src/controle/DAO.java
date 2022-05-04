package controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import modelo.Pet;

public class DAO {
	
	private BufferedReader br;
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
}
