package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Leer 10 enteros y mostrar la media de los valores negativos y la de los positivos.
		
		int numeros[] = new int [10];
		int i = 0;
		int sumNeg = 0;
		int sumPos = 0;
		int contNeg = 0;
		int contPos = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < numeros.length; i++){
			System.out.println("Numero: [" + i + "]= ");
			numeros[i] = sc.nextInt();
		}
		
		for(i=0 ; i < numeros.length; i++){
			if(numeros[i] < 0)
				sumNeg = sumNeg + numeros[i];
				contNeg++;
			if (numeros[i] > 0)
				sumPos = sumPos + numeros[i];
				contPos++;
		}
		
		System.out.println("La media de los valores negativos es de: " + sumNeg/contNeg + " y la de los valores positivos es de " + sumPos/contPos);
		
		sc.close();

	}

}
