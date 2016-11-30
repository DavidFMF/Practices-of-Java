package EjerciciosConExcepciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) { // Leer una secuencia de 10 números y mostrar la suma y el producto de ellos.
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int [10]; //Array que contedrá los números leídos por teclado
		int pos = 0, neg = 0; //Contadores de los números positivos y negativos
		int i = 0;
		double sumaPos = 0, sumaNeg = 0; //Acumuladores para las sumas de números positivos y negativos
		
		System.out.println("Lectura de los números del array:");
		for (i = 0; i < 10; i++){
			System.out.println("Numeros [" + i + "]= ");
			numeros[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i++){
			if (numeros[i] >= 0){
				sumaPos += numeros[i];
				pos++;
			}
				else if (numeros[i] < 0){
				sumaNeg += numeros[i];
				neg++;
				}
		}
		
		if (pos != 0)
			System.out.println("Media de los valores positivos: " + sumaPos/pos);
		else
			System.out.println("No se han introducido números positivos");
		
		if (neg != 0)
			System.out.println("Media de los valores negativos: " + sumaNeg/neg);
		else
			System.out.println("No se han introducido números negativos");
		
		sc.close();
		
	}
	
}
