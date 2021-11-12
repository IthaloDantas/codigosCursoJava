package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.print("Digite o primeiro numero inteiro: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        b = sc.nextInt();
        soma = a + b;

        System.out.println("Soma = " + soma);

        sc.close();
    }
}
