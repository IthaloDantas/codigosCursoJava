package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ( x == 0 && y == 0){
            System.out.println("Esta na Origem. ");
        }
        else if ( x == 0){
            System.out.println("Esta no eixo y. ");
        }
        else if (y == 0){
            System.out.println("Esta no eixo x. ");
        }
        else if (x > 0 && y > 0){
            System.out.println("Esta Q1 ");
        }
        else if (x < 0 && y > 0){
            System.out.println("Esta no Q2 ");
        }
        else if (x < 0 && y < 0 ){
            System.out.println("Esta no Q3 ");
        }
        else{
            System.out.println("Esta no Q4 ");
        }

        sc.close();
    }
}
