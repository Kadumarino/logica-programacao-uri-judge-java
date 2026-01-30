package uriJudge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota1 = -1, nota2 = -1;

        while (nota1 < 0 || nota1 > 10) {
            nota1 = sc.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
            }
        }

        while (nota2 < 0 || nota2 > 10) {
            nota2 = sc.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            }
        }

        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);

        sc.close();
    }
}
