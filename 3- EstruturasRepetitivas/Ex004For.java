import java.util.Scanner;
public class Ex004For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++ ){
            double p1 = sc.nextInt();
            double p2 = sc.nextInt();

            if (p1 <= 0 && p2 <= 0){
                System.out.println("Divisão Impossível");
            }else{
                double divisão = p1 / p2;
                System.out.println(divisão);
            }
        }


        sc.close();


    }
}
