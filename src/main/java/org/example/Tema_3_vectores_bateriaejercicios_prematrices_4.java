package org.example;

import java.util.Scanner;

public class Tema_3_vectores_bateriaejercicios_prematrices_4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce número máximo de m: ");
        int m = read.nextInt();

        primos:
        for (int i = 2; i <=m ; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j == 0){

                    continue primos;

                }

            }

            System.out.print(i + " ");
        }

    }

}
