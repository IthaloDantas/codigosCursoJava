package com.company;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program_retangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Entre com os valores do retangulo : ");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();

        System.out.printf("Area : %.2f%n ", ret.area());
        System.out.printf("Perimetro : %.2f%n ", ret.perimetro());
        System.out.printf("Diagonal : %.2f%n ", ret.diagonal());

        sc.close();

    }
}
