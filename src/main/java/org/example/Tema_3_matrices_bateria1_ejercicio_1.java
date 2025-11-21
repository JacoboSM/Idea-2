package org.example;

import java.util.Scanner;

public class Tema_3_matrices_bateria1_ejercicio_1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int num_us = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.println("Dime el numero para la posicion " + i + " " + j);
                num_us = read.nextInt();
                matriz[i][j] = num_us;

            }

        }

        System.out.println("Numero que quieres buscar");
        int buscar = read.nextInt();


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                if (buscar == matriz[i][j]){

                    System.out.println("El numero " + buscar + " esta en la posicion " + i +"," + j);
                    break;

                }

            }

        }

    }

}
