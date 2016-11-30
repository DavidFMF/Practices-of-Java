package EjerciciosGenerales;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		
		//Leer números y contar cuantos acaban en 2. Acaba cuando lee un nº negativo.
		
		Scanner sc = new Scanner (System.in);
		int n;
		int contador = 0;
		
		System.out.println("Introduce un nº cualquiera");
		n = sc.nextInt();
	
	    while(n>=0){
            if(n%10==2) //Si el número acaba en dos
                contador++; //esta variable contendrá cuántos números acabados en 2 se han leído.
             System.out.print("Introduce un número entero: ");
             n = sc.nextInt();
       }
       System.out.println("Se han introducido " + contador + " números acabados en 2");
       sc.close();
	}
		

}


