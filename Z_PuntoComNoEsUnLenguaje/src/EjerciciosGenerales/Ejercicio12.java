package EjerciciosGenerales;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Convertir a n�meros romanos.
		
		int n1;
		String roman[] = {"/","I","II","III","IV","V","VI","VII","VIII","IX","X"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero del 1 al 10 para pasarlo a n�meros romanos:");
		n1 = sc.nextInt();
		
		if(n1 == Integer.parseInt(roman[n1]))
			System.out.println("El n� " + n1 + " equivale en n�meros romanos " + roman[n1]);
		else
			System.out.println("No has introducido un n�mero natural del 1 al 10");		
		
		sc.close();

	}

}
