package EjerciciosConExcepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	
	public static void main(String[] args) { //Leer una secuencia de n�meros, hasta que se introduce un n�mero negativo y mostrar la suma de dichos n�meros.
		
		Scanner sc = new Scanner(System.in);
		int num, suma = 0;
		
		do{
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� los n�meros, si detectamos uno negativo, se interrumpir� el programa"));
			if (num < 0)
				break;
			suma = suma + num;
			} while (num >= 0);
				System.out.println("Suma total = " + suma);
		
		
		sc.close();
		
		
	}

}
