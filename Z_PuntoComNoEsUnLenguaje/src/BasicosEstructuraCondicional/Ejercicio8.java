package BasicosEstructuraCondicional;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Calcular el mayor de 3 numeros enteros.
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Introduce el primer n�mero");
	    num1 = sc.nextInt();
	    
		System.out.println("Introduce el segundo n�mero");
		num2 = sc.nextInt();
				
		System.out.println("Introduce el tercer n�mero");
		num3 = sc.nextInt();
		
		
		if (num1 > num2)
			if (num1 > num3)
				System.out.println("El mayor es el primer n�mero: " + num1);
			else
				System.out.println("El mayor es el tercer n�mero: " + num3);
		else if (num2 > num3)
			System.out.println("El mayor es el segundo n�mero: " + num2);
		else
			System.out.println("El mayor es el tercer n�mero: " + num3);
		
		sc.close();

	}

}
