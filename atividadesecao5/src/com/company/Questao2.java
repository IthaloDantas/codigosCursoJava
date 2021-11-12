package com.company;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Numero é par. ");
        }
        else{
            System.out.println("Numero é impar. ");
        }

        sc.close();

        // verificaremos se ele e par ou impar pegando o resto da divisão por 2 (mod), se o resultado for zero então ele é par, senao é impar.//


    }
}
