package com.company;

import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas ? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom Dia ");
        }
        else if (hora >= 18){
            System.out.println("Boa Noite ");
            }
         if (hora < 18){
            System.out.println("Boa Tarde ");
        }


        sc.close();
    }
}
