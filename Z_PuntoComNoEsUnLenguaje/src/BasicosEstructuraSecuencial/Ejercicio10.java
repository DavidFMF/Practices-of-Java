package BasicosEstructuraSecuencial;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Leer un nº de cifras y mostrarlas por separado.
				
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.println("Introduzca un valor para N");
		
		N = sc.nextInt(); //Debe tener 3 cifras
		System.out.println("La primera cifra es: " + N + " -> " + (N/100));
		System.out.println("La segunda cifra es: " + N + " -> " + (N/10)%10);
		System.out.println("La tercera cifra es: " + N + " -> " + (N%10));
		
		sc.close();
	}
	
}
