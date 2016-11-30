package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Leer 10 enteros y guardarlos en un array. Mostrar la media de los números que estén en las posiciones pares.
		
		int numeros[] = new int [10];
		int i = 0;
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lectura de los elementos del array (10): ");
		for(i = 0; i<10; i++){
			System.out.println("Numero[" + i + "]= ");
			numeros[i] = sc.nextInt();
		}
		
		for(i = 0; i<10 ; i++){
			if(i%2==0){ //si la posicion actual es par
			media = media + numeros[i];
			}
		}
		
		System.out.println("La media de los numeros pares del array es " + media/5);
		
		sc.close();

	}

}
