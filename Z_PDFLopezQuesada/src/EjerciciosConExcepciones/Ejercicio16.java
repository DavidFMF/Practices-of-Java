package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio16 {
	
	public static void main(String[] args) throws NumberFormatException, IOException { //Leer una secuencia de números y mostrar cuales de ellos es el mayor y el menor, el proceso
		//finalizará cuando se introduzca un número impar.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int mayor = 0, menor = 0;
		
		System.out.println("Introduce un número:");
		int n;
		try {
			n = Integer.valueOf(in.readLine().trim()).intValue();
			mayor = n;
			menor = n;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		do{
			System.out.println("Introduce otro número:");
				n = Integer.valueOf(in.readLine().trim()).intValue();
				if (n > mayor)
					mayor = n;
				if (n < menor)
					menor = n;
		} while ((n % 2) == 0);
				
		
		System.out.println("El número mayor es " + mayor);
		System.out.println("El número menor es " + menor);
			
	}
			
}