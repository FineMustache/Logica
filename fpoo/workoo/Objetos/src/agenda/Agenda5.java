package agenda;

import agenda.Contato;

public class Agenda5 {
	
	public static void main(String[] args) {
		
		Contato c1 = new Contato(1, "Amanda", 15, "(19) 99800-1392");
		Contato c2 = new Contato(2, "Renato", 20, "(19) 98751-1749");
		
		System.out.println(c1.contatoTab());
		System.out.println(c2.contatoTab());
		
	}

}
