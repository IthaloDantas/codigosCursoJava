package com.company;

import java.util.Scanner;

public class Problema1while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0){
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);


        sc.close();

        /* o codigo fica voltando ate o valor de x for 0 e a variavel soma vai acumulando pois so quem troca de valor
        é X  o codigo fica voltando com um novo valor de x e somando so ira parar quando a var for 0    */

    }
}
