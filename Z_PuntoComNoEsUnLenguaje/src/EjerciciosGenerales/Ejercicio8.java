package EjerciciosGenerales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Comprobar si 2 números son amigos.
		
		int i, suma = 0, n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nº:");
		n1 = sc.nextInt();
		System.out.println("Introduce otro nº:");
		n2 = sc.nextInt();
		
		for(i = 1;i < n1; i++){ //for para sumar todos los divisores de n1
			if(n1%i == 0){
				suma = suma + i;
			}
		}
		
		if(suma == n2){ //si la suma de todos los divisores de n1 es igual a la de n2
			suma = 0;
			for(i = 1; i < n2; i++){ //sumo los divisores propios de n2
				if(n2%1 == 0){
					suma = suma + i;
				}
			}
			
			if(suma == n1){ //si la suma de todos los divisores de n2 es igual a la de n1
				System.out.println("Son amigos");
			}else{
					System.out.println("No son amigos");
			}
		}else{
			System.out.println("No son amigos");
		}
					
		sc.close();
		
	}
	
}
