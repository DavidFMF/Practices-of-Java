package BasicosEstructuraCondicional;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Leer un n� entero y determinar si es par o impar.
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqui el n�mero:"));
		
		if(number%2==0)
			System.out.println("El n�mero " + number + " es par");
		else
			System.out.println("El n�mero " + number + " es impar");
		
	}
	
}
