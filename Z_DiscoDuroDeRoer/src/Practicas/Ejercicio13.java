package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		//Aplicaci�n que pide un n� de ventas. Despu�s pedir� tantas ventas como n� de ventas indicadas. Al final mostrar la suma de todas ellas.
		
		int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero ventas realizadas:"));
		
		int sumaVentas = 0;
		
			for (int i = 0; i < numVentas ; i++){
				int venta = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cuant�a de la venta n� " + (i+1)));
				
				sumaVentas = sumaVentas + venta;
				
			}
			
		System.out.println("La suma de las ventas es de " + sumaVentas);
			
	}

}
