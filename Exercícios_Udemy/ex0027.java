import java.util.Scanner;

public class ex0027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		// Lerá a linha inteira

		x = teclado.nextInt();
		teclado.nextLine();
		s1 = teclado.nextLine();
		s2 = teclado.nextLine();
		s3 = teclado.nextLine();

		System.out.println("Dados digitados");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		teclado.close();

	}
}