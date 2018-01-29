package ejerciciosTema5;

import java.util.*;

public class EjerciciosTema5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random() * 100) + 1;
		int numero;
		int intentos = 0;
		
		System.out.println("Adivine un número escogido aleatoriamente. Escriba el número: ");
		numero = sc.nextInt();
		
		
		
		do {
			
			intentos++;
			if (numero < aleatorio) {
			System.out.println("El número a adivinar es mayor. \n Escriba otro número: ");
			numero = sc.nextInt();}
					
			else if (numero > aleatorio) {
				System.out.println( "El número a adivinar es menor. \n Escriba otro número: ");
				numero = sc.nextInt();}
		}
		while (numero != aleatorio);
		
		System.out.println("¡Enhorabuena! el número a adivinar es " + aleatorio);
		System.out.println("Número de intentos: " + intentos);
		sc.close();
	}
}
