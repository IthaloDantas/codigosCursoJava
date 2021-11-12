package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero : ");
        num = sc.nextInt();

        if (num < 0){
            System.out.println("O numero digitado é negativo. ");
        }
        else{
            System.out.println("O numero digitado é positivo. ");
        }

        sc.close();




    }
}
