import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		String numero = teclado.nextLine();
		int Nhoras = teclado.nextInt();
		double Vhoras = teclado.nextDouble();
		
		double salario = (double) Nhoras * Vhoras;
		
		System.out.printf("NUMBER = %S", numero);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		
		
		teclado.close();
		
	}

}
