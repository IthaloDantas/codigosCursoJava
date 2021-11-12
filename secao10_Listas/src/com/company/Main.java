package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Rick");

       // list.remove("Ana"); remove elemento chamado Ana list.remove(1); posicao para remover maria




        for (String x : list){
            System.out.println(x); // para cada string x pertencente a minha lista list vai mandar imprimir na tela x
        }

        System.out.println("Tamanho da lista : " + list.size());

        System.out.println("-------------------------------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println("------------------------------------------");
        System.out.println(name);


    }
}
