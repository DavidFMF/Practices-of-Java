package BasicosEstructuraSecuencial;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Leer la longitud de 2 catetos de un tri�ngulo rect�ngulo y calcular la longitud de la hipotenusa.
		
		double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Longitud del cateto 1: "));
		double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Longitud del cateto 2: "));
		
		System.out.println("El cateto n�1 tiene una longitud de " + cateto1 + " cm, el cateto n�2 mide " + cateto2
				+ " cm, y la hipotenusa mide " + Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2))) + " cm" );
		
	}
	
}
