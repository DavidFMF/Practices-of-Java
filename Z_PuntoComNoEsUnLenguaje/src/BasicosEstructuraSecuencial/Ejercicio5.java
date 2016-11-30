package BasicosEstructuraSecuencial;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Leer por teclado el radio de una circunferencia y mostrar su longitud y su área.
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud del radio aquí:"));
		
		System.out.println("La siguiente circunferencia tiene un radio de: " + radio + " cm, una longitud de " + 2*(Math.PI)*radio
				+ "cm, y un área de " + Math.PI*(Math.pow(radio, 2)) + " cm2" );
		
	}
	
}
