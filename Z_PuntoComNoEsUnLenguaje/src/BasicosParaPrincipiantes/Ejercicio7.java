package BasicosParaPrincipiantes;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		//Declarar variable entera con un valor. Mostrar mensaje de si el valor es positivo o negativo, si es par
		//o impar, si es múltiplo de 5, de 10 y si es mayor o menor que 100.
		
		int C = 26;
		
		System.out.println((C>0) ? "Es positivo" : "Es negativo");
		System.out.println(C%2==0 ? "Es par" : "Es impar");
		System.out.println(C%5==0 ? "Es múltiplo de 5" : "NO es múltiplo de 5");
		System.out.println(C%10==0 ? "Es múltiplo de 10" : "NO es múltiplo de 10");
		System.out.println(C > 100 ? "Es mayor que 100" : "Es menor que 100");
		
	}

}
