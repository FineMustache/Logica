package agenda;

import agenda.Contato;

public class Agenda {
	
	public static void main(String[] args) {
		
		Contato c1 = new Contato();
		c1.id = 30;
		c1.nome = "Jaqueline";
		c1.idade = 19;
		
		System.out.println(c1.id + "\t" + c1.nome + "\t" + c1.idade);

	}

}
