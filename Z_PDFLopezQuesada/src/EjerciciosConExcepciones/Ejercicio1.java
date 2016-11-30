package EjerciciosConExcepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 { //Leer un número y mostrar por la salida estándar si dicho número es o no es par.
	
	public static void main(String[] args){	
		
		Scanner sc = new Scanner(System.in);		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce un número entero y comprobaremos si es par o impar"));
		
		if (numero % 2 == 0)
			System.out.println("El numero " + numero + " es par.");
		else
			System.out.println("El numero " + numero + " es impar.");
		
		sc.close();
		
	}

}
