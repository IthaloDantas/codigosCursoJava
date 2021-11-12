package com.company;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i<N; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y ==0){
                System.out.println("divisão impossivel. ");
            }
            else{
                double div = (double) x/y; // O uso desse double em parenteses é que x e y la em cima é interio e aqui precisamos colocar com double para o resuldado ser com ponto flutuante e sair o resultando certo
                System.out.printf("%.1f.%n", div);
            }

        }

        sc.close();
    }
}
