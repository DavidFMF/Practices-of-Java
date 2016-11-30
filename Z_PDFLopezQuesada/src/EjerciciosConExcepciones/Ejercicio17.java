package EjerciciosConExcepciones;

import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main(String[] args) { //Leer una secuencia de números y sumar solo los pares mostrando el resultado del proceso.
		
		Scanner sc = new Scanner (System.in);
		
		int [] secuencia = new int [6];
		int suma = 0;
		
		System.out.println("Introduce 6 números para realizar la suma de los que sean pares:");
		for (int i = 1; i < 7; i++){
			System.out.println("Numero [" + i + "º] = ");
			secuencia [i] = sc.nextInt();
		if (secuencia [i] % 2 == 0) {
			suma += secuencia[i];
			System.out.println("La suma está en " + suma);
		}
			else
				System.out.println("Ese número era impar...");
		}
		
		System.out.println("Resultado final de las sumas: " + suma);
				
		sc.close();
		
	}

}