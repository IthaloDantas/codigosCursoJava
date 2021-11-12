package com.company;

public class Main {

    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        for (String vect2 : vect){
            System.out.println(vect2);
        }
    }
}
