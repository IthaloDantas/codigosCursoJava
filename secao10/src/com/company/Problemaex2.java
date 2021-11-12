package com.company;

import entities.Program2;

import java.util.Locale;
import java.util.Scanner;

public class Problemaex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Program2[] vect = new Program2[n];  // iniciando o vetor / objeto

        for (int i = 0; i<n; i++){
            sc.nextLine(); // comendo a linha do sc.nextint de cima
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Program2(name , price); // alocando os valores name e price em cada posição do vetor
        }

        double sum = 0.0;
        for (int i = 0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }
        double media = sum / n;

        System.out.println("Media : " + media);



        sc.close();
    }
}
