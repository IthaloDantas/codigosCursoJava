package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua senha : ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha invalida");
            System.out.print("Porfavor digite a senha correta : ");
            senha = sc.nextInt();
        }

        System.out.println("Senha correta. ");



        sc.close();
    }
}
