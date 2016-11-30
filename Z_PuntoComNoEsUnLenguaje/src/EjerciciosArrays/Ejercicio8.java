package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Leer el nombre y sueldo de 20 empleados y mostrar el nombre y el sueldo del que más gana.
		
		Scanner sc = new Scanner(System.in);
		
		String [] empleados = new String[5];
		double [] sueldos = new double [5];
		String nombreMayor;
		double sueldoMayor;
		int i = 0;
		
		System.out.println("Lectura del nombre y sueldo de los empleados:");
		System.out.println("Empleado " + (i + 1) + ": ");
		empleados[i] = sc.nextLine();
		System.out.println("Sueldo:");
		sueldos[i] = sc.nextDouble();
		
		sueldoMayor = sueldos[i]; //Tomamos el primero como el mayor
		nombreMayor = empleados[i];
		
		for(i = 1;i < empleados.length; i++){
			sc.nextLine(); //Limpiamos el buffer
			System.out.println("Empleado " + (i + 1) + ": ");
			empleados[i] = sc.nextLine();
			System.out.println("Sueldo:");
			sueldos[i] = sc.nextDouble();
			if(sueldos[i] > sueldoMayor) //Comparamos el sueldo leído con el mayor
				sueldoMayor = sueldos[i];
				nombreMayor = empleados[i];
		}
		
		System.out.println("Empleado con mayor sueldo: " + nombreMayor);
        System.out.println("Sueldo: " + sueldoMayor);
		
		sc.close();

	}

}
