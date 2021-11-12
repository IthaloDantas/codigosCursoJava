package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.print("Digite o primeiro numero inteiro : ");
        a = sc.nextInt();
        System.out.print("Digite o segundo numero inteiro : ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro numero inteiro: ");
        c = sc.nextInt();
        System.out.print("Digite o quarto numero inteiro: ");
        d = sc.nextInt();
        diferenca = (a * b - c * d);

        System.out.println("A diferença é de : " + diferenca);
    }
}
