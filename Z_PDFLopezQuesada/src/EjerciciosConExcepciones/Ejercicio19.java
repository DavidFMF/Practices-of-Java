package EjerciciosConExcepciones;

import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) { //Leer una secuencia de 10 n�meros y mostrar la suma de los 5 n�meros que ocupan posiciones de lectura par.
		
		Scanner sc = new Scanner(System.in);
		
		int [] secuencia = new int [11];
		int suma = 0, pos = 0;
		
		System.out.println("Introduce aqu� la secuencia de n�meros:");
		for(int i = 1; i < 11; i++){
			System.out.println("Numero [" + i + "�] =" );
			secuencia[i] = sc.nextInt();
			pos++;
			if (pos % 2 == 0)
				suma += secuencia[i];
				System.out.println("La suma de los 5 primeros n�meros es: " + suma);
		}
		
		sc.close();
				
	}

}