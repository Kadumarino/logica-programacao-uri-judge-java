package uriJudge;

import java.util.Scanner;

public class Uri1115 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) { // declarando que quando o o X e Y for diferente de Zero, será verdadeiro e passará pelos (IF), caso contrario o loop se desfaz
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}