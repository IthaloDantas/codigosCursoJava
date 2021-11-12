package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i<mat.length; i++){ //lenght vai percorrer a quantidade de linhas
            for (int j = 0; j< mat[i].length; j++){ // vai percorrer a quantidade de colunas
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for (int i =0; i<n; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int contar = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (mat[i][j] < 0){
                    contar++;
                }
            }
        }
        System.out.println("Negative Numbers : " + contar);


        sc.close();
    }
}
