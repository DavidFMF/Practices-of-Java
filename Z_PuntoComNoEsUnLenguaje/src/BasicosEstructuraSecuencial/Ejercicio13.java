package BasicosEstructuraSecuencial;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//Calcular el nº de la suerte de una persona a partir de su fecha de nacimiento.
		
		Scanner sc = new Scanner (System.in);		
		
		int dia = 0;
		int mes = 0;
		int año = 0;
		int suerte;
		int suma;
		int cifra1;
		int cifra2;
		int cifra3;
		
		System.out.println("Introduzca la fecha de namiento");
		System.out.println("Día:");
		dia = sc.nextInt();
		System.out.println("Mes:");
		mes = sc.nextInt();
		System.out.println("Año");
		año = sc.nextInt();
		
		suma = dia + mes + año;
		
		cifra1 = suma/1000;
		cifra2 = suma/100%10;
		cifra3 = suma/10%10;
		
		suerte = cifra1 + cifra2 + cifra3;
		System.out.println("Su número de la suerte es: " + suerte);
		
		sc.close();		
		
	}
	
}
