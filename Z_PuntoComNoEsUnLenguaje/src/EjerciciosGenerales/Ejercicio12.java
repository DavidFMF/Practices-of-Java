package EjerciciosGenerales;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Convertir a números romanos.
		
		int n1;
		String roman[] = {"/","I","II","III","IV","V","VI","VII","VIII","IX","X"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número del 1 al 10 para pasarlo a números romanos:");
		n1 = sc.nextInt();
		
		if(n1 == Integer.parseInt(roman[n1]))
			System.out.println("El nº " + n1 + " equivale en números romanos " + roman[n1]);
		else
			System.out.println("No has introducido un número natural del 1 al 10");		
		
		sc.close();

	}

}
