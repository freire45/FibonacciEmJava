package Fibonacci;

/**
 * Programa que calcula a série de Fibonacci as 15 primeiras posições
 * @author Erick Freire
 * @version 1 - Criado em 20/10/2021
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		int contador = 1;
		int anterior = 0;
		int posterior = 1;
		
		while(contador <= 15) {
			if(contador == 1) {
				System.out.println("0");
				contador = contador + 1;
			} else {
				if(contador == 2) {
					System.out.println("1");
					contador = contador + 1;
				} else {
					System.out.printf("%d\n", posterior);
					anterior = posterior - anterior;
					posterior = posterior + anterior;
					contador = contador + 1;
				}
			}
			
		}

	}

}
