package BasicosEstructuraCondicional;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		//Leer un car�cter por teclado y comprobar si es may�scula.
		
		Scanner sc = new Scanner(System.in);
		
		char car = 0;
		
		System.out.println("Introduce un caracter aqu�");
		try {
			car = (char)System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(Character.isUpperCase(car))
			System.out.println("Es una letra may�scula");
		else
			System.out.println("Es una letra min�scula");
		
		sc.close();

	}

}
