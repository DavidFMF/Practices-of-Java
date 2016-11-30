package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Leer N alturas y calcular la altura media. Calcular cuántas hay superiores y cuántas inferiores.
		
		int [] alturas = new int [5];
		int i = 0;
		int sumaAlturas = 0;
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < alturas.length; i++){
			System.out.println("Alturas: [" + i + "]= ");
			alturas[i] = sc.nextInt();
		}
		
		for(i = 0; i < alturas.length; i++){
			media = sumaAlturas + alturas[i];
			if(alturas[i] > media)
				System.out.println("La altura " + i + " tiene una longitud superior a la media: " + + alturas[i]);
			if(alturas[i] < media)
				System.out.println("La altura " + i + " tiene una longitud inferior a la media: " + alturas[i]);
		}
		
		System.out.println("La media de todas las alturas es de " + media);
		
		sc.close();

	}

}
