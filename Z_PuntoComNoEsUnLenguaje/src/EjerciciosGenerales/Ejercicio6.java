package EjerciciosGenerales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Comprobar si un n� es perfecto.
				
		int i, suma = 0, n;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero para comprobar si es perfecto");
		n = sc.nextInt();
		
		for(i = 1; i < n; i++){
			if (n%i == 0){
				suma = suma + i;
			}
		}
		if (suma == n)
			System.out.println("El n� es perfecto");
		else
			System.out.println("El n� NO es perfecto");
		
		sc.close();
		
	}

}
