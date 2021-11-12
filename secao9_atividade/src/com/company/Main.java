package com.company;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account; // declara a var aqui fora para ela n ficar limitada apenas ao if e podermos usar fora do if

        System.out.println("Enter account number : ");
        int number = sc.nextInt();
        System.out.println("Enter accout holder : ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n) ? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Enter initial deposit value : ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder , initialDeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println("Accout data : ");
        System.out.println(account);

        System.out.print("Enter a deposit value : ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data : ");
        System.out.println(account);

        System.out.print("Enter a whithdraw value : ");
        double whithdrawValue = sc.nextDouble();
        account.whithdraw(whithdrawValue);
        System.out.println("Updated account data : ");
        System.out.println(account);



        sc.close();
    }
}
