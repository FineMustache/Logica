import java.util.Scanner;

public class Processa2{
	public static Scanner leia;
	public static void main(String[] args){
		leia = new Scanner(System.in);
		//Entrada
		int v1 = leia.nextInt();
		//Sa�da
		System.out.printf("Voc� digitou %d \n",v1);
	}
}