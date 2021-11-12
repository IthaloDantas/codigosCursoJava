package com.company;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Emplyoee # " + (i + 1) + ":");

            System.out.print("Id : ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){ // enquanto o id digitado for igual a um id que ja existe vai imprimir isso
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name : ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary : ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id , name, salary); //instanciando o objeto employee para dps inserir na lista

            list.add(emp); //Inserindo os dados do Employee a lista

        }

        System.out.println("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();
        //Integer pos = position(list , idsalary);
        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null); // faz a mesma coisa que a função pos so que mais simples
        // somente os funcionarios x tal que x x.getId seja igual ao idsalary
        if (emp == null){
            System.out.println("This id does not exist! ");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
            //list.get(pos).increaseSalary(percent);
        }

        System.out.println("List of employees: ");
        for (Employee e : list){ // for earch para cada employee da minha lista vai imprimir o emp
            System.out.println(e);
        }


    }

    /*public static Integer position(List<Employee> list, int id){ //Função externa (auxiliar) para saber se o id é existente
        for (int i = 0; i< list.size(); i++ ){ // list.size vai percorrer so o tamanho da lista
            if (list.get(i).getId() == id){ // se o id na posição i for igual ao id que o usuario deu vai retornar i
                return i;
            }
        }
        return null; // se o id não existir vai retornar nulo */

    public static boolean hasId(List<Employee> list, int id) { // função auxiliar para nao ter id repitido
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null; // condição
    }
    }

