package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {
	
	public static void main(String[] args) { //Calcular la media de una secuencia de números.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cont = 0, num = 0, sum = 0;
		double media = 0;
		
		System.out.println("Por favor, introduzca la cantidad de números para calcular su media");
		int n = 0;
		try {
			n = Integer.valueOf(in.readLine().trim()).intValue();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (cont = 0; cont < n; cont++){
			System.out.println("Introduce un valor: " + "(" + (cont+1) + "º)");
			try {
				num = Integer.valueOf(in.readLine().trim()).intValue();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			sum = sum + num;			
		}
		
		media = sum/n;
		
		System.out.println("La media de la sencuencia es: " + media);
		
	}

}
