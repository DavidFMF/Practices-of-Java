package EjerciciosConExcepciones;

import java.util.Scanner;

public class Ejercicio18 {
	
	public static void main(String[] args) { //Leer una secuencia de 10 n�meros y mostrar los 5 primeros pares le�dos.
		
		Scanner sc = new Scanner(System.in);
		
		int [] secuencia = new int [10];
		
		System.out.println("Introduce 10 n�meros:");
		for(int i = 1; i < 11; i++){
			System.out.println("Numero [" + i + "�] =" );
			secuencia[i] = sc.nextInt();
			if (secuencia[i] % 2 == 0){
				System.out.println("Par n�" + i + " con valor " + secuencia[i]);
			} else
				System.out.println("Ese n�mero era impar...");
		}		
		
		sc.close();			
		
	}

}