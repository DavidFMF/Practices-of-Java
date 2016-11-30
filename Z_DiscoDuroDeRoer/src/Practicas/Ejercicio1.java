package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	//Declara 2 variables numéricas, mostrar por consola la suma, resta, multiplicación, división y módulo.
	
	public static void main(String[] args) {
	
	int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número A, por favor", JOptionPane.QUESTION_MESSAGE));
	int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número B, por favor", JOptionPane.QUESTION_MESSAGE));


		System.out.println("El resultado de la suma es: " + (numeroA+numeroB));
		
		System.out.println("El resultado de la resta es: " + (numeroA-numeroB));
	
		System.out.println("El resultado de la multiplicacion es: " + (numeroA*numeroB));

		System.out.println("El resultado de la divison es: " + (numeroA/numeroB));
		
		System.out.println("El resultado del módulo es: " + (numeroA%numeroB));
		
	}
	
}




