package controllers;

import java.util.ArrayList;

import models.DAO;
import models.Manutencao;

public class ProcessaManutencoes {
	public static ArrayList<Manutencao> manutencoes = new ArrayList<>();
	
	private static DAO md = new DAO();
	
	public static void salvar() {
		md.escrever(manutencoes);
		abrir();
	}
	
	public static void abrir() {
		manutencoes = md.ler();
	}
}
