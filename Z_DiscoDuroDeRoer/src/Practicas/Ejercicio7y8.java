package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio7y8 {
	
	public static void main(String[] args) {
		
		//Lee un nº por teclado y mostrar por consola el carácter al que pertenece en la tabla ASCII.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		char caracter = (char)numero;
		
		System.out.println("El número introducido " + numero + " corresponde al carácter " + caracter + " en la tabla ASCII");
		
	}

}
