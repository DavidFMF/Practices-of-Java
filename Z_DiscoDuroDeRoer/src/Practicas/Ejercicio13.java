package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		//Aplicación que pide un nº de ventas. Después pedirá tantas ventas como nº de ventas indicadas. Al final mostrar la suma de todas ellas.
		
		int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número ventas realizadas:"));
		
		int sumaVentas = 0;
		
			for (int i = 0; i < numVentas ; i++){
				int venta = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cuantía de la venta nº " + (i+1)));
				
				sumaVentas = sumaVentas + venta;
				
			}
			
		System.out.println("La suma de las ventas es de " + sumaVentas);
			
	}

}
