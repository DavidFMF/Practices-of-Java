package BasicosEstructuraSecuencial;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Leer un entero de 5 cifras y mostrarlo por consola en pir�mide repetido.
		
		Scanner sc = new Scanner (System.in);
		
		int N;
		System.out.println("Introduce aqu� tu n�mero");
		
		N = sc.nextInt(); //El n�mero deber� tener 5 cifras.
		
		System.out.println(N/10000);
		System.out.println(N/1000);
		System.out.println(N/100);
		System.out.println(N/10);
		System.out.println(N/1);
		
		sc.close();
		
	}
	
}
