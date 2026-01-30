package uriJudge;

import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir,
// calcule e mostre o valor da conta a pagar.

public class Uri1038 {


    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtds = sc.nextInt();
        double total;

        if (codigo == 1) {
            total = qtds * 4.0;
        } else if (codigo == 2) {
            total = qtds * 4.50;
        } else if (codigo == 3) {
            total = qtds * 5.00;
        } else if (codigo == 4) {
            total = qtds * 2.00;
        }else {
            total = qtds * 1.50;
        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
