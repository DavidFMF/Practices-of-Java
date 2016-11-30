package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {
	
	public static void main(String[] args) { //Lee una secuencia de n�meros y determina cual es el mayor de ellos.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cont = 0, num = 0;
		int mayor = 0;
		
		System.out.println("�Cuantos n�meros quieres leer?");
		int n = 0;
		try {
			n = Integer.valueOf(in.readLine().trim()).intValue();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (cont = 0; cont < n; cont++){
			System.out.println("Introduce un n�mero: " );
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
		
		System.out.println("El n�mero mayor es: " + mayor);	
				
	}

}