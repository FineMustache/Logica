package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Aluno;

public class DAO {
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "C:\\Users\\des\\Documents\\SENAI2022\\Logica\\fpoo\\work25\\alunos\\dados\\entrada.csv";
	private String saida = "C:\\Users\\des\\Documents\\SENAI2022\\Logica\\fpoo\\work25\\alunos\\dados\\saida.csv";
	
	public ArrayList<Aluno> abrir() {
		ArrayList<Aluno> linhas = new ArrayList<Aluno>();
		
		Aluno p;
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String l = br.readLine();
			
			while(l != null) {
				p = new Aluno(l);
				linhas.add(p);
				l = br.readLine();
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return linhas;
	}
	
	public void salvar(ArrayList<Aluno> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Aluno l : linhas) {
				bw.write(l.toString() + "\r\n");
			}
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
}
