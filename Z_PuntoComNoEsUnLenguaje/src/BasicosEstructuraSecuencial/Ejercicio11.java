package BasicosEstructuraSecuencial;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Leer un entero de 5 cifras y mostrarlo por consola en pirámide repetido.
		
		Scanner sc = new Scanner (System.in);
		
		int N;
		System.out.println("Introduce aquí tu número");
		
		N = sc.nextInt(); //El número deberá tener 5 cifras.
		
		System.out.println(N/10000);
		System.out.println(N/1000);
		System.out.println(N/100);
		System.out.println(N/10);
		System.out.println(N/1);
		
		sc.close();
		
	}
	
}
