package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio7y8 {
	
	public static void main(String[] args) {
		
		//Lee un n� por teclado y mostrar por consola el car�cter al que pertenece en la tabla ASCII.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero:"));
		char caracter = (char)numero;
		
		System.out.println("El n�mero introducido " + numero + " corresponde al car�cter " + caracter + " en la tabla ASCII");
		
	}

}
