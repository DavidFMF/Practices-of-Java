package BasicosEstructuraCondicional;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Leer un nº entero y determinar si es par o impar.
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqui el número:"));
		
		if(number%2==0)
			System.out.println("El número " + number + " es par");
		else
			System.out.println("El número " + number + " es impar");
		
	}
	
}
