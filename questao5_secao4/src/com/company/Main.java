package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int cod1, cod2 , qnt1, qnt2;
        double preco1, preco2, total;

        System.out.print("Digite o código do produto 1 : ");
        cod1 = sc.nextInt();
        System.out.print("Digite a quantidade do produto: ");
        qnt1 = sc.nextInt();
        System.out.print("Digite o preço do produto 1 : ");
        preco1 = sc.nextDouble();

        System.out.print("Digite o código do produto 2 : ");
        cod2 = sc.nextInt();
        System.out.print("Digite a quantidade do produto: ");
        qnt2 = sc.nextInt();
        System.out.print("Digite o preço do produto: ");
        preco2 = sc.nextDouble();

        total = preco1 * qnt1 + preco2 * qnt2;

        System.out.printf("Valor a pagar : %.2f%n ", total) ;

        System.out.println("Codigo do produto 1 : " + cod1);

        System.out.println("Codigo do produto 2 : " + cod2);

        sc.close();
    }
}
