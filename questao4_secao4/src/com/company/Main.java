package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double salarioh, salariototal;

        System.out.print("Digite o seu numero : ");
        numero = sc.nextInt();
        System.out.print("Digite a quantidade de horas que você trabalha: ");
        horas = sc.nextInt();

        System.out.print("Digite quanto você ganha por hora trabalhada: ");
        salarioh = sc.nextDouble();
        salariototal = horas * salarioh;

        System.out.println("O seu numero é : " + numero);

        System.out.printf(" O seu numer salariototal= %.2f%n ", salariototal);

        sc.close();
    }
}
