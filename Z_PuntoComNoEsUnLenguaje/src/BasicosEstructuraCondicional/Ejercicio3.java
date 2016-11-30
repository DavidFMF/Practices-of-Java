package BasicosEstructuraCondicional;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		//Leer un carácter por teclado y comprobar si es mayúscula.
		
		Scanner sc = new Scanner(System.in);
		
		char car = 0;
		
		System.out.println("Introduce un caracter aquí");
		try {
			car = (char)System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(Character.isUpperCase(car))
			System.out.println("Es una letra mayúscula");
		else
			System.out.println("Es una letra minúscula");
		
		sc.close();

	}

}
