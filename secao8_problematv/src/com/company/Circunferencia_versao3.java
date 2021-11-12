package com.company;

import util.Calculator_two;

import java.util.Scanner;

public class Circunferencia_versao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator_two.circumference(radius);
        double v = Calculator_two.volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator_two.PI);
    }
}
