import java.util.Scanner;

public class bascara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		double delta, b, a, c, x1, x2;
		
		System.out.println("Informe o valor de A");
		a = teclado.nextDouble();
		System.out.println("Informe o valor de B");
		b = teclado.nextDouble();
		System.out.println("Informe o valor de C");
		c = teclado.nextDouble();
		
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("x1 linha é igual " +  x1);
		System.out.println("x2 linha é igual " +  x2);
		
		teclado.close();
		
		
	}

}
