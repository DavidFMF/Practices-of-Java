package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio13 { // Generar enteros de 3 en 3 comenzando por 2 hasta el valor máximo menor que 30.
						   // Calculando la suma de los enteros generados que sean divisibles por 5.
		
		/** Método encargado de comprobar si el numero es divisible por 5 */
		public static boolean Divisibles(int cont){
			boolean encontrado = false;
			if ((cont % 5) == 0) {
				System.out.println("Nº: " + cont + " es divisible");
				encontrado = true;
				return(encontrado);
			}
			else {
				System.out.println("Nº: " + cont + " no es divisible");
				return(encontrado);
			
				}
		}
		
		public static void main(String[] args) throws IOException{
		
			int suma = 0;
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			for (int cont = 2; cont < 30; cont = cont+3){
				if (Divisibles(cont) == true)
					suma = suma + cont;
			}
			
		System.out.println("La suma de los divisibles es: " + suma);
			
	}

}