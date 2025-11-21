package org.example;

import java.util.Scanner;

public class Tema_3_vectores_bateriaejercicios_prematrices_2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce la altura...");
        int altura = read.nextInt();

        for (int i = 1; i <= altura; i++){

            for (int j = 1 ; j <= i; j++ ){

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
