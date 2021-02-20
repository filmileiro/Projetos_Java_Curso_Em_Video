import java.util.Scanner;

public class Ex001while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        while (entrada != 2002){

            System.out.println("Senha Inválida");
            entrada = sc.nextInt();
        }

        System.out.println("Acesso Permitido");


        sc.close();
    }
}
