package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio16 {
	
	public static void main(String[] args) throws NumberFormatException, IOException { //Leer una secuencia de n�meros y mostrar cuales de ellos es el mayor y el menor, el proceso
		//finalizar� cuando se introduzca un n�mero impar.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int mayor = 0, menor = 0;
		
		System.out.println("Introduce un n�mero:");
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
			System.out.println("Introduce otro n�mero:");
				n = Integer.valueOf(in.readLine().trim()).intValue();
				if (n > mayor)
					mayor = n;
				if (n < menor)
					menor = n;
		} while ((n % 2) == 0);
				
		
		System.out.println("El n�mero mayor es " + mayor);
		System.out.println("El n�mero menor es " + menor);
			
	}
			
}