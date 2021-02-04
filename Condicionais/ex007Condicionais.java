import java.util.Locale;
import java.util.Scanner;

public class ex007Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		double x = teclado.nextDouble();
		double y = teclado.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else {
			if (x > 0 && y > 0) {
				System.out.println("Q1");
			} else if (x > 0 && y < 0) {
				System.out.println("Q4");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("Q3");
			}
		}

		teclado.close();
	}

}
