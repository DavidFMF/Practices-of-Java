package BasicosEstructuraCondicional;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Leer variable entera mes y comprobar si corresponde a un mes de 31, 30 o 28 dias. Mostrar el nombre de ese mes.
		//Comprobar que el valor introducido esté entre 1 y 12.
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del mes a consultar:"));
		
		if (mes < 1 || mes > 12)
			System.out.println("Error. Introduce un número de mes entre 1 y 12, por favor");
		else
					
			switch (mes){
			case 1: System.out.println("El mes " + mes + " corresponde a Enero"); 
				break;
			case 2: System.out.println("El mes " + mes + " corresponde a Febrero"); 
				break;
			case 3: System.out.println("El mes " + mes + " corresponde a Marzo"); 
				break;
			case 4: System.out.println("El mes " + mes + " corresponde a Abril"); 
				break;
			case 5: System.out.println("El mes " + mes + " corresponde a Mayo"); 
				break;
			case 6: System.out.println("El mes " + mes + " corresponde a Junio"); 
				break;
			case 7: System.out.println("El mes " + mes + " corresponde a Julio"); 
				break;
			case 8: System.out.println("El mes " + mes + " corresponde a Agosto"); 
				break;
			case 9: System.out.println("El mes " + mes + " corresponde a Septiembre"); 
				break;
			case 10: System.out.println("El mes " + mes + " corresponde a Octubre"); 
				break;
			case 11: System.out.println("El mes " + mes + " corresponde a Noviembre"); 
				break;
			case 12: System.out.println("El mes " + mes + " corresponde a Diciembre"); 
				break;
			}
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			System.out.println("El mes " + mes + " tiene 31 días");
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			System.out.println("El mes " + mes + " tiene 30 días");
		if (mes == 2)
			System.out.println("El mes " + mes + " tiene 29 días");
							

	}

}
