import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = teclado.nextDouble();
		
		double area = pi * Math.pow(raio, 2.0);
		
		
		System.out.printf("A = %.4f", area);
		
		
	}

}
