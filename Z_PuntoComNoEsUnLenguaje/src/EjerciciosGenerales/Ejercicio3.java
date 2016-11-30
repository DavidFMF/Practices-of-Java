package EjerciciosGenerales;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		
		//Pasar de grados Cº a Kelvin. El proceso de leer grados se debe repetir mientras que se responda 'S' a la pregunta de continuar.
		
		Scanner sc = new Scanner (System.in);
		
		char carac;
		
		do{
		int grados = Integer.parseInt(JOptionPane.showInputDialog("Introduce aquí la cantidad de grados, por favor"));
		
		System.out.println("Los grados Cº eran " + grados + ", en º Kelvin son " + (grados+273.15) + "º");
		
		System.out.println("¿Repetir proceso?");
		
		carac = (char)System.in.read();
		}while(carac != 'n' && carac != 'N');
		
		sc.close();		
			
	}

}
