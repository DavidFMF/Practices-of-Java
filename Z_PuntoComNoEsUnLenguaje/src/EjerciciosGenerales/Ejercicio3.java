package EjerciciosGenerales;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		
		//Pasar de grados C� a Kelvin. El proceso de leer grados se debe repetir mientras que se responda 'S' a la pregunta de continuar.
		
		Scanner sc = new Scanner (System.in);
		
		char carac;
		
		do{
		int grados = Integer.parseInt(JOptionPane.showInputDialog("Introduce aqu� la cantidad de grados, por favor"));
		
		System.out.println("Los grados C� eran " + grados + ", en � Kelvin son " + (grados+273.15) + "�");
		
		System.out.println("�Repetir proceso?");
		
		carac = (char)System.in.read();
		}while(carac != 'n' && carac != 'N');
		
		sc.close();		
			
	}

}
