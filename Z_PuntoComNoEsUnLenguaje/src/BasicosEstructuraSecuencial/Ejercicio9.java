package BasicosEstructuraSecuencial;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Calcular el área de un triángulo sabiendo la longitud de sus lados.
		
		int lado1 = 10;
		int lado2 = 25;
		int lado3 = 30;
		
		int s = (lado1 + lado2 + lado3)/2;
	
		System.out.println("El área del triágulo es de " + Math.sqrt(s*((s-lado1)*(s-lado2)*(s-lado3))));
		
	}
	
}
