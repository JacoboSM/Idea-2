package org.example;

import java.util.Scanner;

public class Bucles {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

//        for (;;){
//            System.out.println("Hola");
//        }

        while (true) {

            String palabra = read.next();

            if (palabra.equals("Hola")){
                continue;
            }

            System.out.println("Dime hola");

        }

        }

    }

