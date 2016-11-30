package EjerciciosConExcepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Ejercicio1Exception { //Leer un número y mostrar su tabla de multiplicar.
		
		Scanner sc = new Scanner(System.in);
		
		int numeroX = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí un número positivo para ver su tabla de multiplicar"));
		
		if (numeroX <= 0)
			throw new Ejercicio1Exception("El número que introduzcas no puede ser negativo o igual que 0");
		else if (numeroX > 10)
			throw new Ejercicio1Exception("El número introducido no puede ser mayor de 10");
		
		for (int i = 0; i <=10; i++){
			int resultado = numeroX*i;
			System.out.println(numeroX + " x " + i + " = " + resultado);	
		}
				
		
		sc.close();
		
		
	}

}
