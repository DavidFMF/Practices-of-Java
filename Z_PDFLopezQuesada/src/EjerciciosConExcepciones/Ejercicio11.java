package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {
	
	public static void main(String[] args) { //Lee una secuencia de números y determina cual es el mayor de ellos.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cont = 0, num = 0;
		int mayor = 0;
		
		System.out.println("¿Cuantos números quieres leer?");
		int n = 0;
		try {
			n = Integer.valueOf(in.readLine().trim()).intValue();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (cont = 0; cont < n; cont++){
			System.out.println("Introduce un número: " );
			try {
				num = Integer.valueOf(in.readLine().trim()).intValue();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		if (num > mayor)
			mayor = num;
		}
		
		System.out.println("El número mayor es: " + mayor);	
				
	}

}