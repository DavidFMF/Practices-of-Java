package Practicas;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Mostrar los números del 1 al 100 divisibles entre 2 y 3 con el bucle que sea.
		
		int x = 1;
		
		while (x <= 100){
			if (x%2 == 0 || x%3 == 0) {
				System.out.println(x);
			}
			x++;
		}
		
	}
}
