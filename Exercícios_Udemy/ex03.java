import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		
		int diferenca = (a * b) - (c *d);
		
		System.out.printf("DIFERECA = %d", diferenca);
		
		teclado.close();
		
		
		
	}

}
