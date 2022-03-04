package ex;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Matriz5 {
	
	static Random r = new Random();
	public static void main(String[] args) {
		
		int maiorImp = 0, menorImp = 101, maiorPar = 0, menorPar = 101, qtdeImp = 0, qtdePar = 0, mediaImp = 0, mediaPar = 0;
		
		Integer impares[] = {};
		Integer pares[] = {};
		
		int[][] m = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				m[i][j] = r.nextInt(100);
			}
		}
		
		
		System.out.println("Números Ímpares:");
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if(m[i][j] % 2 != 0) {
					
					qtdeImp++;
					
					impares = addX(impares.length, impares, m[i][j]);
					
					System.out.println(m[i][j]);
					
					if(m[i][j] > maiorImp)
						maiorImp = m[i][j];
				
					if(m[i][j] < menorImp)
						menorImp = m[i][j];
				}
				
				
			}
			
		}
		
		System.out.println("\n" + qtdeImp + " dos 25 são ÍMPARES");
		System.out.println("Maior Valor Impar = " + maiorImp);
		System.out.println("Menor Valor Impar = " + menorImp);
		System.out.println("_______________________________________");
		
		System.out.println("Números Pares:");
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if(m[i][j] % 2 == 0) {
					
					qtdePar++;
					
					pares = addX(pares.length, pares, m[i][j]);
					
					System.out.println(m[i][j]);
					
					if(m[i][j] > maiorPar)
						maiorPar = m[i][j];
				
					if(m[i][j] < menorPar)
						menorPar = m[i][j];
				}
				
				
			}
			
		}
		
		System.out.println("\n" + qtdePar + " dos 25 são PARES");
		System.out.println("Maior Valor Par = " + maiorPar);
		System.out.println("Menor Valor Par = " + menorPar);
		System.out.println("_______________________________________");
		
		int somaImp = 0;
		
		for (int i = 0; i < impares.length; i++) {
			somaImp += impares[i];
		}
		
		mediaImp = somaImp / impares.length;
		
		int somaPar = 0;
		
		for (int i = 0; i < pares.length; i++) {
			somaPar += pares[i];
		}
		
		mediaPar = somaPar / pares.length;
		
		System.out.println("\nMédia dos Ímpares = " + mediaImp);
		System.out.println("Média dos Pares = " + mediaPar);
		System.out.println("_______________________________________");
		
		Arrays.sort(impares);
		double medianoImp;
		if (impares.length % 2 == 0)
		    medianoImp = ((double)impares[impares.length/2] + (double)impares[impares.length/2 - 1])/2;
		else
		    medianoImp = (double) impares[impares.length/2];
		
		Arrays.sort(pares);
		double medianoPar;
		if (pares.length % 2 == 0)
		    medianoPar = ((double)pares[pares.length/2] + (double)pares[pares.length/2 - 1])/2;
		else
		    medianoPar = (double) pares[pares.length/2];
		
		System.out.println("\nMEDIANO ÍMPAR = " + medianoImp);
		System.out.println("MEDIANO PAR = " + medianoPar);
		
	}
	
	
	
	// Function to add x in arr
    public static Integer[] addX(int n, Integer arr[], int x)
    {
        int i;
  
        // create a new ArrayList
        List<Integer> arrlist
            = new ArrayList<Integer>(
                Arrays.asList(arr));
  
        // Add the new element
        arrlist.add(x);
  
        // Convert the Arraylist to array
        arr = arrlist.toArray(arr);
  
        // return the array
        return arr;
    }

}
