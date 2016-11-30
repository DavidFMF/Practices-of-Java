package BasicosParaPrincipiantes;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declarar 4 variables enteras con un valor. B tomará el valor de C, C tomará el valor de A, A lo tome de D
		//y D lo tome de B.
		
		int A = 5;
		int B = 10;
		int C = 8;
		int D = 16;
		
		System.out.println("Valor inicial de A: " + A);
		System.out.println("Valor inicial de B: " + B);
		System.out.println("Valor inicial de C: " + C);
		System.out.println("Valor inicial de D: " + D);
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println("Valor final de A: " + A);
		System.out.println("Valor final de B: " + B);
		System.out.println("Valor final de C: " + C);
		System.out.println("Valor final de D: " + D);
		
	}
}
