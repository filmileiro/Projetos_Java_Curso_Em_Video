import java.util.Scanner;

public class Ex007For {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 5; i++){

            System.out.println(i + " " +(int)Math.pow(i, 2) + " " + (int)Math.pow(i,3));

        }

        sc.close();
    }
}
