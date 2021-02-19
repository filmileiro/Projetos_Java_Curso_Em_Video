import java.util.Locale;
import java.util.Scanner;

public class ex009Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		
		double aux, a2, bc;
		
		
		if (b > a) {
			aux = a;
			a = b;
			b = aux;
			
		}
		if (c > a) {
			aux = a;
			a = c;
			c = aux;
			
		}
		
		a2 = Math.pow(a, 2);
		bc = Math.pow(b, 2) + Math.pow(c, 2);
		
		
		if (a >= b + c) {
			System.out.println("NÃO FORMA TRIANGULO");
		}
		else {
			if (a2 > bc) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else if (a2 < bc) {
				System.out.println("TRIANGULO OCUTANGULO");
			}
			else {
				System.out.println("TRIANAGULO RETANGULO");
			}
			if (a == b && b == c) {
			System.out.println("TRIANAGULO EQUILATERO");
			} else if (a == b || a == c || b == c  ) {
				System.out.println("TRIANGULO ISOSCELES");
			}
			
			
		}

		
		teclado.close();
		
		
	}

}
