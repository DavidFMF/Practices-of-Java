package BasicosEstructuraCondicional;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Leer 3 numeros que contienen hora, minutos y segundos y comprobar si la hora que muestran es válida.
				
		int H = Integer.parseInt(JOptionPane.showInputDialog("Introduce una cantidad de horas:"));
		int M = Integer.parseInt(JOptionPane.showInputDialog("Introduce una cantidad de minutos:"));;
		int S = Integer.parseInt(JOptionPane.showInputDialog("Introduce una cantidad de segundos:"));;
		
		if(H >= 0 && H <= 24 && M >= 0 && M <= 24 && S >= 0 && S <= 24)
			System.out.println("La hora introducida es correcta");
		else
			System.out.println("La hora NO es correcta");
		
		
	}

}
