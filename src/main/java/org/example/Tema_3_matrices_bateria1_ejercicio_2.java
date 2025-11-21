package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema_3_matrices_bateria1_ejercicio_2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[random.nextInt(5)+1][random.nextInt(5)+1];
        int suma = 0;

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = random.nextInt(100)+1;
                suma = suma + matriz[i][j];

            }

            System.out.println("Suma fila " + (i+1) + " : " + suma);
            suma = 0;

        }

        suma = 0;
        System.out.println(" ");

        for (int i = 0; i < matriz[0].length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                suma = suma + matriz[j][i];

            }

            System.out.println("Suma columna " + (i+1) + " : " + suma);
            suma = 0;

        }

        suma = 0;
        int fila = random.nextInt(matriz.length-1);
        for (int i = 0; i < matriz[0].length; i++) {

            suma += matriz[random.nextInt(matriz.length-1)][i];

        }

        System.out.println("fila " + (fila+1) + ":" + suma);

        System.out.println(" ");
        System.out.println("Matriz :");

        for (int[] columna : matriz){
            for (int num : columna){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

}
