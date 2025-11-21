package org.example;

import java.util.Scanner;

public class Tema_2_trazas_practica {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int a, b, c, d;

        a = read.nextInt();

        b = 0;

        c = 1;

        while (a!=0){

            b++;
            c = c * a / b;
            a = read.nextInt();

        }

        d = b + c;

        System.out.println(d);

    }

}
