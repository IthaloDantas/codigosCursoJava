package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.print("Digite o valor de A : ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B : ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de C : ");
        c = sc.nextDouble();

        triangulo = a * c / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("Triangulo : %.3f%n", triangulo);
        System.out.printf("Circulo:  %.3f%n", circulo);
        System.out.printf("Trapezio:  %.3f%n", trapezio);
        System.out.printf("Quadrado:  %.3f%n", quadrado);
        System.out.printf("Retangulo:  %.3f%n",retangulo    ) ;
    }
}
