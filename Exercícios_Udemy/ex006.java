import java.util.Locale;
import java.util.Scanner;


public class ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		String numeroPeca1 = teclado.next();
		int quantiPecas1 = teclado.nextInt();
		double valorPeca1 = teclado.nextDouble();
		
		String numeroPeca2 = teclado.next();
		int quantiPecas2 = teclado.nextInt();
		double valorPeca2 = teclado.nextDouble();
		
		double total = (double) (quantiPecas1 * valorPeca1) + (quantiPecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		
		teclado.close();
		

	}

}
