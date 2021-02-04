import java.util.Locale;
import java.util.Scanner;

public class ex006Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double a = 0.25;
		double b = 25.50;
		double c = 50.75;
		double d = 75.100;
		
		double entrada = teclado.nextDouble();
		
		if (entrada >= 0 && entrada <= 25) {
			System.out.println("Intervalo [0,25]");
		}else {
			if (entrada > 25 && entrada <= 50) {
				System.out.println("Intervalo (25,50]");
			}else if (entrada > 50 && entrada <= 75) {
				System.out.println("Intervalo (50,75]");
				
			}else if (entrada > 75 && entrada <= 100 ) {
				System.out.println("Intervalo (75,100]");
				
			}else {
				System.out.println("Fora de intervalo");
			}
		}
		
		
		teclado.close();

	}

}
