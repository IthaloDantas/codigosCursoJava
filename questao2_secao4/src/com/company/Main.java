package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double pi, area, raio;

        System.out.print("Digite o valor do raio : ");
        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * raio *raio;

        System.out.printf("area=%.4f%n ", area);

    }
}
