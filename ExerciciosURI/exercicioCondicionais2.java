package processamentoDeDados;

import java.util.Scanner;


/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/

public class exercicioCondicionais2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		
		Scanner teclado = new Scanner(System.in);
		
		numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		 }
		else {
			System.out.println("IMPAR");
		}
		
		teclado.close();
		
		
		
	}

}
