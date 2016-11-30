package EjerciciosConExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {
	
	public static void menu(){
		System.out.println("Menú de opciones:");
		System.out.println("1. Convertir a Binario");
		System.out.println("2. Convertir a Hexadecimal");
		System.out.println("3. Convertir a Octal");
		System.out.println("4. Salir");
		System.out.println("");
		System.out.println("Elegir una opción 1-4:");
	}

	public static void main(String[] args) { //Dado un número mostrar su valor en binario.
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		System.out.println("Introduce aquí un número para mostrar su valor en binario, hexadecimal u octal:");
				
		try {
			n = Integer.valueOf(in.readLine().trim()).intValue();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		menu();
		int opcion = 0;
		try {
			opcion = Integer.valueOf(in.readLine().trim()).intValue();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch(opcion){
			case 1: System.out.println("Binario");
			System.out.println(Integer.toBinaryString(n));
		break;
			case 2: System.out.println("Hexadecimal");
			System.out.println(Integer.toHexString(n));
		break;
			case 3: System.out.println("Octal");
			System.out.println(Integer.toOctalString(n));
		break;
			case 4: break;
			default: System.out.println("Introduce una opción 1-4");
			break;				
		}
				
	}
	
}