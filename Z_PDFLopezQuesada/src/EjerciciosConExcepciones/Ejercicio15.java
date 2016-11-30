package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio15 {

	public static void main(String[] args) { //Generar los N primeros términos de la serie de Fibonacci. El valor N(entero y positivo) deberá
		//ser leído por el teclado. En esta serie los dos primeros números son 1, y el resto se obtiene
		//sumando los dos anteriores: 1,1,2,3,5,8,13,21…

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("Por favor, introduce un nº para empezar a mostrar la serie de Fibonacci");
		try {
			int  N = Integer.valueOf(in.readLine().trim()).intValue();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Matematica a = new Matematica();
//		a.Calcula_Fibonacci(N);
//		System.out.println(a.Calcula_Fibonacci(N));
//		
	}
	
}
