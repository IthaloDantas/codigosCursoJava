package com.company;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program_rectangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Digite a largura e a altura do retangulo : ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area : %.2f%n", rect.area());
        System.out.printf("Perimetro : %.2f%n", rect.perimeter());
        System.out.printf("Diagonal : %.2f%n", rect.diagonal());

        sc.close();
    }
}
