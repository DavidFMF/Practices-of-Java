package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	//Declara 2 variables num�ricas, mostrar por consola la suma, resta, multiplicaci�n, divisi�n y m�dulo.
	
	public static void main(String[] args) {
	
	int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero A, por favor", JOptionPane.QUESTION_MESSAGE));
	int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero B, por favor", JOptionPane.QUESTION_MESSAGE));


		System.out.println("El resultado de la suma es: " + (numeroA+numeroB));
		
		System.out.println("El resultado de la resta es: " + (numeroA-numeroB));
	
		System.out.println("El resultado de la multiplicacion es: " + (numeroA*numeroB));

		System.out.println("El resultado de la divison es: " + (numeroA/numeroB));
		
		System.out.println("El resultado del m�dulo es: " + (numeroA%numeroB));
		
	}
	
}




