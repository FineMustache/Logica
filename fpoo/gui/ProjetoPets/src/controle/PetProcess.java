package controle;

import java.util.ArrayList;

import modelo.Pet;

public class PetProcess {
	
	public static ArrayList<Pet> pets = new ArrayList<Pet>();
	private static DAO dao =  new DAO();
	
	public static void abrir() {
		pets = dao.ler();
	}
	
	public static void salvar() {
		dao.escrever(pets);
		abrir();
	}
	
	public static void carregarTestes() {
		pets = new ArrayList<>();
		
		pets.add(new Pet(1, "Cachorro", "Toto", "Vira Latas", 26, "01/01/2015", "Joaquin", "(19)98787-7171"));
		pets.add(new Pet(2, "Gato", "Sett", "SRD", 5, "28/06/2020", "Luiza", "(19)98708-7490"));
		pets.add(new Pet(3, "Macaco", "Denis", "Sagui", 1, "01/05/2019", "Paulo", "(19)97541-8899"));
		pets.add(new Pet(4, "Papagaio", "Mahi", "Verdadeiro", 26, "24/10/2009", "Renato", "(19)94517-7712"));
		pets.add(new Pet(5, "4 reais de mussarela", "Naldo", "Tirolez", 1, "30/04/2022", "Guilherme", "(19)98452-6978"));
	}
}
