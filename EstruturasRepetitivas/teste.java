import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota do Aluno");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota do Aluno");
		double nota2 = sc.nextDouble();
		double media =(nota1 + nota2) / 2;
		
		if (media >= 5.5) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		
		
		
		
		
		
		sc.close();
		

	}

}
