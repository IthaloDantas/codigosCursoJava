package com.company;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0 ){
            System.out.println("São Multiplos. ");
        }
        else {
            System.out.println("Não são multiplos. ");
        }

        sc.close();

            //Para saber se um número aleatório é múltiplo de outro número específico, basta apenas que se faça a divisão entre eles e verificar o resto da operação.
            //Se o resto for zero, então é múltiplo, se não, o valor não é múltiplo.



    }
}
