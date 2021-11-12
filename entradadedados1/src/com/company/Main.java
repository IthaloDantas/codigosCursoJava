package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ao inves de sc poderia ser qualquer outro nome de variavel. \\

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite aqui: ");
        x = sc.nextInt();
        System.out.println("Você digitou : " + x);



        sc.close();
    }
}
