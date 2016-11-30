package EjerciciosConExcepciones;

import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) { //Leer una secuencia de 10 números y mostrar la suma de los 5 números que ocupan posiciones de lectura par.
		
		Scanner sc = new Scanner(System.in);
		
		int [] secuencia = new int [11];
		int suma = 0, pos = 0;
		
		System.out.println("Introduce aquí la secuencia de números:");
		for(int i = 1; i < 11; i++){
			System.out.println("Numero [" + i + "º] =" );
			secuencia[i] = sc.nextInt();
			pos++;
			if (pos % 2 == 0)
				suma += secuencia[i];
				System.out.println("La suma de los 5 primeros números es: " + suma);
		}
		
		sc.close();
				
	}

}