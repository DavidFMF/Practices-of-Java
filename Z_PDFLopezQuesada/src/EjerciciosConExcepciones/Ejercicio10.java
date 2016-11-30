package EjerciciosConExcepciones;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) { //Leer una secuencia de números y mostrar su suma, el proceso finalizará cuando el usuario pulse a la tecla F.   //TO DO
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int [3];
		int i = 0, suma = 0;
		String entradaTeclado;
//		boolean letraF = false;
//		boolean letraP = false;
		
		System.out.println("Lectura de los números del array");
		for (i = 0; i < 3; i++){
			System.out.println("Numeros [" + i + "]= ");
			numeros[i] = sc.nextInt();
			suma += numeros[i];
		}
		
		System.out.println("El proceso se está ejecutando sin interrupción, pulse tecla 'F' para detener la prueba. Si quiere ver el resultado, pulse 'R'");
		
		entradaTeclado = sc.nextLine(); 
				
		if (sc.next("¿Que hacemos?").equals('F')) 
			System.out.println("El proceso se ha detenido antes de mostrar el resultado");
	    else if (sc.next("¿Que hacemos?").equals('R'))
			System.out.println("El producto de la secuencia de números es " + suma);
	    else
	    	System.out.println("Tu respuesta no ha producido ninguna opción");
				
		sc.close();
		
		
	}

}
