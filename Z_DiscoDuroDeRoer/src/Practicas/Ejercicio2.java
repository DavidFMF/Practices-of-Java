package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declara 2 variables num�ricas e indica cual es mayor de las 2. Indicar si son iguales.

		int primerNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el primer n�mero"));
		int segundoNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� el segundo n�mero"));

		if (primerNum > segundoNum)
			System.out.println("El primer n�mero es mayor que el segundo");
		else if (primerNum == segundoNum)
			System.out.println("El primer n�mero es igual al segundo");
		else
			System.out.println("El segundo n�mero es mayor que el primero");

	}

}