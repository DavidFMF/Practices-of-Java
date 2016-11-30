package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		//Lee un nº por teclado que pida el precio de un producto y calcula el precio final con IVA (21%).
		
		final double iva = 1.21;
		
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio del producto:"));
		
		double precioFinal = precio * iva;
		
		System.out.println("El precio final del producto será de " + precioFinal + " euros");
		
	}

}
