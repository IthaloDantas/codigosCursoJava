package com.company;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = sc.nextInt();

        while (codigo != 4){
            if (codigo == 1){
                alcool = alcool + 1;
            }
            else if (codigo == 2){
                gasolina = gasolina + 1;
            }
            else if (codigo == 3){
                diesel = diesel + 1;
            }
            else if (codigo > 4){
                System.out.println("Codigo invalido. ");
            }

            codigo = sc.nextInt();
        }

        System.out.println("Muito obrigado. ");
        System.out.println("Alcool : " + alcool);
        System.out.println("Gasolina : " + gasolina);
        System.out.println("Diesel : " + diesel);

        sc.close();
    }
}
