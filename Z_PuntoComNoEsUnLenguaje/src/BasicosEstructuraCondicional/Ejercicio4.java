package BasicosEstructuraCondicional;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		
		//Leer 2 caracteres por teclado y comprobar si son iguales.
		
		Scanner sc = new Scanner(System.in);
				
		char carac1, carac2;
		
		System.out.print("Introduce el primer caracter:");
		carac1 = (char)System.in.read();
		System.in.read(); //Saltamos el intro que se ha quedado en el bufer.
		System.out.print("Introduce el segundo caracter:");
		carac2 = (char)System.in.read();
		
		Character c1 = new Character(carac1);
		Character c2 = new Character(carac2);
		
		if (c1.equals(c2))
			System.out.println("Los 2 caracteres introducidos son iguales");
		else
			System.out.println("Los 2 caracteres introducidos son diferentes");
		
		sc.close();
	

	}

}
