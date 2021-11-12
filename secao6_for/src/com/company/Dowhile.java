package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius : ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n " , F);
            System.out.print("Deseja repetir (s/n) ? : ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');

        /* resp precisa ser declarado fora pq o compilador entende que a variavel so foi declarada apenas na primeira
        chave não reconhecendo no while */



        sc.close();
    }
}

/*System.out.println("Digite a temperatura em Celsius : ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.2f%n " , F);
        System.out.print("Deseja repetir (s/n) ?");
        char resp = sc.next().charAt(0);

        while (resp != 'n'){
            System.out.println("Digite a temperatura em Celsius : ");
             C = sc.nextDouble();
             F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n " , F);
            System.out.print("Deseja repetir (s/n) ?");
             resp = sc.next().charAt(0);
        }
        Outro modo é esse mas não é muito certo de se fazer. */
