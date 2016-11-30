package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Contar el nº de positivos, negativos y ceros en un array de 10 elementos.
		
	    Scanner sc = new Scanner(System.in);
		
		int numeros [] = new int [10];
		int numPos = 0;
		int numNeg = 0;
		int ceros = 0;
		int i = 0;
		
		for(i = 0; i < numeros.length; i++){
			System.out.println("Numeros: [" + i + "]=");
			numeros[i] = sc.nextInt();
				
		}
		
		for(i = 0; i < numeros.length; i++){
			if(numeros[i] > 0)
				numPos++;
			else if(numeros[i] < 0)
				numNeg++;
			else
				ceros++;	
		}
		
		System.out.println("Numeros positivos: " + numPos + ", numeros negativos: " + numNeg + ", cantidad de ceros: " + ceros);
		
		sc.close();

	}

}
