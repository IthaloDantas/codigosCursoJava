package com.company;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program_salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name : ");
        emp.name = sc.nextLine();
        System.out.print("GrossSalary : ");
        emp.grosssalary = sc.nextDouble();
        System.out.print("Imposto : ");
        emp.imposto = sc.nextDouble();

        System.out.println("Employee : " + emp);
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Updated data : " + emp);

        sc.close();
    }
}
