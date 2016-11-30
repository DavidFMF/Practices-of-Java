package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		//Lee un nº por teclado e indica si es divisible entre 2 (resto = 0). Indicar si no lo es.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor introduce aquí tu número:"));
		
		if (numero%2 == 0)
			System.out.println("El número " + numero + " es divisible entre 2");
		else
			System.out.println("El número " + numero + " NO es divisible entre 2");
		
		
	}

}
