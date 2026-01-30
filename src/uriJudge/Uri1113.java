package uriJudge;

import java.util.Scanner;

public class Uri1113 {

    public static void main(String[] args) {

        int X, Y;

        Scanner sc = new Scanner(System.in);

        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != Y) {
            if (X < Y) {
            System.out.println("Crescente");
        }else {
            System.out.println("Decrescente");
        }
            X = sc.nextInt();
            Y = sc.nextInt();
    }
        sc.close();
}
}