package EjerciciosConExcepciones;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 { //Leer 2 n�meros y determinar el mayor de ellos.

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
	try{
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primero n�mero y que sea positivo:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero y que sea positivo:"));
		
		if(numero1 < 0)
			throw new Ejercicio1Exception("Error, el primer n�mero no puede ser negativo");
		else
			if (numero2 <0)
				throw new Ejercicio1Exception("Error, el segundo n�mero no puede ser negativo");
		
		if (numero1 > numero2)
			System.out.println("El primero n�mero introducido (" + numero1 + ") es mayor que el segundo (" + numero2 + ").");
		else if (numero2 > numero1)
			System.out.println("El segundo n�mero introducido (" + numero2 + ") es mayor que el primero (" + numero1 + ").");
		else
			System.out.println("Ambos n�meros son iguales (" + numero1 + ").");
	}
		catch(Ejercicio1Exception ex){
			System.out.println(ex.getMessage());
		}
		catch(Exception exc){
			System.out.println("Error, se llama a la clase Excepcion(general)");
		}
	
	sc.close();	
	
	}
	
}
