package BasicosEstructuraCondicional;

import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {

		//Leer un caracter y comprobar si es un nº.
		
		char car1 = 0;
		
		System.out.println("Introduce un caracter");
		try {
			car1 = (char)System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (Character.isDigit(car1))
			System.out.println("El caracter es un número");
		else
			System.out.println("El caracter NO es un número");

	}

}
