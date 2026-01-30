package uriJudge;

import java.util.Scanner;

public class URI1159 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x;

            while (true) {
                x = scanner.nextInt();
                if (x == 0) break;

                // Se x for ímpar, começa do próximo número par
                if (x % 2 != 0) {
                    x++;
                }

                int soma = 0;
                for (int i = 0; i < 5; i++) {
                    soma += x + (i * 2);
                }

                System.out.println(soma);
            }

            scanner.close();
        }
    }