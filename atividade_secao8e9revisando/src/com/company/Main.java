package com.company;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Escreva os valores do triangulo X : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Escreva os valores do triangulo Y : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();

        double areay = y.area();

        System.out.printf("Area de X : %.4f%n ", areax);
        System.out.printf("Area de Y : %.4f%n ", areay);

        if (areax > areay){
            System.out.println("Area de X é a maior. ");
        }
        else{
            System.out.println("Area de Y é a maior. ");
        }

        sc.close();

    }
}
