import java.util.Locale;
import java.util.Scanner;

public class ex005Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int especificacao = teclado.nextInt();
		int quantidade = teclado.nextInt();
		double total;

		if (especificacao == 1) {
			total = 4.00 * quantidade;
			System.out.printf("%.2f", total);
		} else {
			if (especificacao == 2) {
				total = 4.50 * quantidade;
				System.out.printf("%.2f", total);
			} else if (especificacao == 3) {
				total = 5.00 * quantidade;
				System.out.printf("%.2f", total);
			} else if (especificacao == 4) {
				total = 2.00 * quantidade;
				System.out.printf("%.2f", total);
			} else if (especificacao == 5) {
				total = 1.50 * quantidade;
				System.out.printf("%.2f", total);
			}

		}
		
		

		teclado.close();

	}

}
