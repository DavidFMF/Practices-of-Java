package EjerciciosGenerales;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		
		//Leer n�meros y contar cuantos acaban en 2. Acaba cuando lee un n� negativo.
		
		Scanner sc = new Scanner (System.in);
		int n;
		int contador = 0;
		
		System.out.println("Introduce un n� cualquiera");
		n = sc.nextInt();
	
	    while(n>=0){
            if(n%10==2) //Si el n�mero acaba en dos
                contador++; //esta variable contendr� cu�ntos n�meros acabados en 2 se han le�do.
             System.out.print("Introduce un n�mero entero: ");
             n = sc.nextInt();
       }
       System.out.println("Se han introducido " + contador + " n�meros acabados en 2");
       sc.close();
	}
		

}


