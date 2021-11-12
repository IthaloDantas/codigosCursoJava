package com.company;

import entities.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Program_salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Empregado emp = new Empregado();

        System.out.println("Name : ");
        emp.name = sc.nextLine();
        System.out.println("Salario Bruto : ");
        emp.salariobruto = sc.nextDouble();
        System.out.println("Taxa : ");
        emp.taxa = sc.nextDouble();

        System.out.println("Empregado : " + emp.name + ", $ " + emp.descontodataxa());

        System.out.println("Qual a porcentagem que voce quer acrescentar no salario : ");
        double porcentagem = sc.nextDouble();
        emp.salariocomporcentagem(porcentagem);

        System.out.println(emp);

        sc.close();


    }
}
