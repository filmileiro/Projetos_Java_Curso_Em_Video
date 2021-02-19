import java.util.Locale;
import java.util.Scanner;

public class ex008Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		double salario = teclado.nextDouble();
		double imposto;

		if (salario <= 2000.0) {
			imposto = 0.0;
		} 
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} 
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

		}else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0) {
		 System.out.println("Insento");
		}else {
			System.out.printf("R$ %.2f\n", imposto);
		}
		teclado.close();
	}

}
