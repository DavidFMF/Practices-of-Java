package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declara 2 variables numéricas e indica cual es mayor de las 2. Indicar si son iguales.

		int primerNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el primer número"));
		int segundoNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí el segundo número"));

		if (primerNum > segundoNum)
			System.out.println("El primer número es mayor que el segundo");
		else if (primerNum == segundoNum)
			System.out.println("El primer número es igual al segundo");
		else
			System.out.println("El segundo número es mayor que el primero");

	}

}