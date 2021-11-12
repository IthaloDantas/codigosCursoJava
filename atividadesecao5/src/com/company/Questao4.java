package com.company;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horai = sc.nextInt();
        int horaf = sc.nextInt();
        int duracao;

        if (horai < horaf){
            duracao = horaf - horai;
        }
        else {
            duracao = 24 - horai + horaf;
        }

        System.out.println("O jogo durou : " + duracao + "Horas");

        sc.close();

    }

}
