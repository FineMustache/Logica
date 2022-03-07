package ex;

public class Aluno {
	
	public String nome;
	public int matricula;
	public double nota1, nota2, nota3;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double calculaMedia() {
		return (nota1*5 + nota2*3 + nota3*2)/10;
	}
	
	public void mostraAluno() {
		
		double media = calculaMedia();
		
		System.out.printf("%d\t%s\t%.2f\t%.2f\t%.2f", matricula, nome, nota1, nota2, nota3);
		System.out.printf("\n\nMédia: %.2f\n\n", media);
		
		if(media>=5) {
			System.out.println("O aluno está ARPOVADO\n");
		} else {
			System.out.println("O aluno está REPROVADO\n");
		}
		
		System.out.println("___________________________");
	}
}
