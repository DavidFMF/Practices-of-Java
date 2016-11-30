package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 { // TO DO

	public static void main(String[] args) throws NumberFormatException, IOException, Ejercicio1Exception { //Leer dos números y realizar la división mediante restas mostrando el cociente y el resto.
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Introduce el dividendo, por favor");
		int numero1 = Integer.parseInt(br.readLine());
		System.out.println("Introduce el divisor, por favor");
		int numero2 = Integer.parseInt(br.readLine());
		int resta = 0, cont = 1;
		
		if (numero1 < numero2)
			throw new Ejercicio1Exception("Por favor, el primer número debe ser mayor al segundo");		
		do{
			resta = numero1 - resta;
			cont++;
		} while (cont <= numero2);
			System.out.println("La resta es: " + resta);
		
	}
	
}
