package EjerciciosConExcepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	
	public static void main(String[] args) { //Leer una secuencia de números, hasta que se introduce un número negativo y mostrar la suma de dichos números.
		
		Scanner sc = new Scanner(System.in);
		int num, suma = 0;
		
		do{
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí los números, si detectamos uno negativo, se interrumpirá el programa"));
			if (num < 0)
				break;
			suma = suma + num;
			} while (num >= 0);
				System.out.println("Suma total = " + suma);
		
		
		sc.close();
		
		
	}

}
