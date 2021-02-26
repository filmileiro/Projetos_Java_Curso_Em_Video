package Pricipal;

import java.util.Locale;
import java.util.Scanner;
import instaciando.Pacotes;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		new Pacotes();

		double teclado = sc.nextDouble();

		if (teclado >= 0 && teclado <= 25) {
			System.out.println("Intervalo [0,25]");
		} else {
			if (teclado > 25 && teclado <= 50) {
				System.out.println("Intervalo (25,50]");
			} else if (teclado > 50 && teclado <= 75) {
				System.out.println("Intervalo (50,75]");

			} else if (teclado > 75 && teclado <= 100) {
				System.out.println("Intervalo (75,100]");

			} else {
				System.out.println("Fora de intervalo");
			}
		}

		sc.close();

	}

}
