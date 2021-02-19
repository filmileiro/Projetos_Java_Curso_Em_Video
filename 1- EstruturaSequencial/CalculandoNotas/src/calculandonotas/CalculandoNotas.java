package calculandonotas;

import java.util.Scanner;

public class CalculandoNotas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;

        String v1, v2, v3, v4;

        float n1, n2, n3, n4, media;

        System.out.println("Escola Dom Vital");
        System.out.println("");

        System.out.print("Entre com o seu nome: ");
        nome = teclado.nextLine();
        /*Convertendo String para PT Flutuante*/
        System.out.println("");
        System.out.println("Entre com a sua primeira nota");
        v1 = teclado.nextLine();
        n1 = Float.parseFloat(v1);
        System.out.println("Entre com a segunda nota");
        v2 = teclado.nextLine();
        n2 = Float.parseFloat(v2);
        System.out.println("Entre com a terceira nota");
        v3 = teclado.nextLine();
        n3 = Float.parseFloat(v3);
        System.out.println("Entre com a quarta e útima nota");
        v4 = teclado.nextLine();
        n4 = Float.parseFloat(v4);

        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 5.5 && media <= 6.0) {
            System.out.printf("%s  sua média foi %.2f. Logo, você acabou passando por média. \n", nome, media);
        } else if (media > 6.0 && media <= 7.0) {
            System.out.printf("%s sua média foi %.2f. Esta nota é um pouco acima da média. \n", nome, media);
        } else if (media > 7.0 && media <= 10.0) {
            System.out.printf("%s sua média foi %.2f. Esta nota é muito acima da média PARABÉNS!! \n", nome, media);
        } else {
            System.out.printf("%s sua média foi %.2f. Você está reprovado. \n", nome, media);
        }
    }

}
