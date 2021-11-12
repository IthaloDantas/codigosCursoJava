package com.company;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double x= 10.35784;
        int y=10;
        System.out.println(x);
        System.out.printf("%.2f%n" , x);
        System.out.printf("%.8f%n" , x);
        System.out.println("Resultado= " + y + " Metros");
        System.out.printf("Resultado = %.2f metros antes era %d%n" , x, y);
        Locale.setDefault(Locale.US);
    }
}
