package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;

        for (int i = 0; i<N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();

        /* Se incia a variavel i para servir como um contador "eu acho". è o inico ou seja so é lida uma vez ou seja so
        vai ser criado uma var por ser lido so uma vez i é menor que zero por isso vai dar verdadeiro a condição

        * A condição que é i<N vai fazer o loop igual no while

        * E o incremento vai ser i++ para quando chegar ao numero que o usuario digitou parar so é lida na volta quando
        a condição for verdade

        * a Var X vai ser os numeros que o usuario vai digitar

        * e depois a soma de todos             */

        /* Esse i++ é a mesma coisa que i = i + 1 */

        // Usuario vai digitar o valor de numeros que quer inserir e depois vai inserir os numeros a serem somados.//
    }
}
