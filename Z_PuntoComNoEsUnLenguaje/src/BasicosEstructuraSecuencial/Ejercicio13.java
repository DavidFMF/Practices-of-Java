package BasicosEstructuraSecuencial;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//Calcular el n� de la suerte de una persona a partir de su fecha de nacimiento.
		
		Scanner sc = new Scanner (System.in);		
		
		int dia = 0;
		int mes = 0;
		int a�o = 0;
		int suerte;
		int suma;
		int cifra1;
		int cifra2;
		int cifra3;
		
		System.out.println("Introduzca la fecha de namiento");
		System.out.println("D�a:");
		dia = sc.nextInt();
		System.out.println("Mes:");
		mes = sc.nextInt();
		System.out.println("A�o");
		a�o = sc.nextInt();
		
		suma = dia + mes + a�o;
		
		cifra1 = suma/1000;
		cifra2 = suma/100%10;
		cifra3 = suma/10%10;
		
		suerte = cifra1 + cifra2 + cifra3;
		System.out.println("Su n�mero de la suerte es: " + suerte);
		
		sc.close();		
		
	}
	
}
