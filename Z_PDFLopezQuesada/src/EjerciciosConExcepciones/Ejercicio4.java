package EjerciciosConExcepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Ejercicio1Exception { //Leer 3 números y mostrar el mayor de ellos.
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número"));
		
		if (numero1 < 0)
			throw new Ejercicio1Exception("El primer número introducido es negativo y no es correcto");
		else if (numero2 < 0)
			throw new Ejercicio1Exception("El segundo número introducido es negativo y no es correcto");
		else if (numero3 < 0)
			throw new Ejercicio1Exception("El tercer número introducido es negativo y no es correcto");		
		
		if (numero1 > numero2 && numero1 > numero3)
			System.out.println("El primer número introducido (" + numero1 + ") es el mayor de los 3.");
		else if (numero2 > numero1 && numero2 > numero3)
			System.out.println("El segundo número introducido (" + numero2 + ") es el mayor de los 3.");
		else
			System.out.println("El tercer número introducido (" + numero3 + ") es el mayor de los 3.");
		
		sc.close();
		
	}

}
