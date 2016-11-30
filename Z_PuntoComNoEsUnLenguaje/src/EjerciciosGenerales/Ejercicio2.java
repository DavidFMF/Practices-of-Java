package EjerciciosGenerales;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		
		//Calcular el nº de cifras de un entero.
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		int cifras;
		char carac;
		do{
			System.out.println("Introduce un número entero:");
			n = sc.nextInt();
			cifras = 0; //Contador de cifras
			while (n != 0){ //Mientras a n le queden cifras
				n = n/10; //le vamos quitado una más
				cifras++; //sumamos 1 al contador de cifras totales
			}
			System.out.println("El coche tiene " + cifras + " cifras");
			System.out.println("¿Continuar?");
			carac = (char)System.in.read();
		}while(carac!='n' && carac != 'N');
		
		sc.close();
		
	}
	
}


