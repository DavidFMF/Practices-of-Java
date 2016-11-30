package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Guardar en un array los 20 primeros números pares.
		
		int numeros [] = new int [20];
		int i = 0;
		int contador = 2;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < numeros.length; i++){
			numeros[i] = contador;
		    contador += 2;
		}
		
		for(i = 0; i < numeros.length; i++){
			System.out.println("Elementos pares del array: " + numeros[i]);
		}
		
		sc.close();

	}

}
