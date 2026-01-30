package Class;

import java.util.Scanner;
// Leitura de valores pré definidos
public class estruturaFor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        int soma = 0;
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);


        sc.close();

    }

}
