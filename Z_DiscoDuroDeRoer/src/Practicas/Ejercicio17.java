package Practicas;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		//Aplicación que pide el día de la semana y nos dice si es un dia laboral o no (switch).
		
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana:").toLowerCase();
		
		switch(dia){
		case "lunes": System.out.println("El dia " + dia + " es laborable");
			break;
		case "martes": System.out.println("El dia " + dia + " es laborable");
			break;
		case "miercoles": System.out.println("El dia " + dia + " es laborable");
			break;
		case "jueves": System.out.println("El dia " + dia + " es laborable");
			break;
		case "viernes": System.out.println("El dia " + dia + " es laborable");
			break;
		case "sabado": System.out.println("El dia " + dia + " NO es laborable");
			break;
		case "domingo": System.out.println("El dia " + dia + " NO es laborable");
			break;
		}
	}
}
