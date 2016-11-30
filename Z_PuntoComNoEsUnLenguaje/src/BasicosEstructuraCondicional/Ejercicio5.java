package BasicosEstructuraCondicional;

import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		
		//Leer 2 caracteres y comprobar si son 2 letras minúsculas.
		
		char car1, car2;
		
		System.out.println("Introduce el primer caracter");
		car1 = (char)System.in.read();
		System.in.read();
		System.out.println("Introduce el segundo caracter");
		car2 = (char)System.in.read();
		
		Character c1 = new Character(car1);
		Character c2 = new Character(car2);
		
		if (Character.isLowerCase(c1))
			if(Character.isLowerCase(c2))
			System.out.println("Los 2 caracteres son minúsculas");
		else
				System.out.println("El primer caracter es minúscula pero el segundo no");
		if(Character.isLowerCase(c2))
			System.out.println("El segundo caracter es minuscula pero el primero no");
		else
			System.out.println("Ninguno es una letra minuscula");
			
		
	}
}
