import java.util.Locale;
import java.util.Scanner;

public class Ud001 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
	
		
		double largura = teclado.nextDouble();
		double comprimento = teclado.nextDouble();
 		double metroQuadrado = teclado.nextDouble();
 		
 		double area = comprimento * largura;
 		double preco = area * metroQuadrado;
 		
 		System.out.printf("AREA = %.2f\n", area);
 		System.out.printf("PRECO = %.2f\n", preco);
 		
		
		
		
		teclado.close();
		
	}
}
