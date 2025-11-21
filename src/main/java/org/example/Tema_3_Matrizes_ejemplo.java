package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_Matrizes_ejemplo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[][] matriz = {{0,1,2},{3,4,5}}; // asi se pone una matriz

        int[][] matriz_sin_rango = new int [2][3]; // lo primero es las filas y lo segundo las columnas (esto equivale al vector de arriba)

        int[][] matriz_ejemplo = {{0,1,2},{3,4,5},{6,7,8}};

        int[][] matriz_ejemplo_sin_rango = new int [3][3];

        System.out.println(matriz_ejemplo[1][0]);

        for (int i = 0; i < matriz_ejemplo.length; i++){// con esto es filas {

            for (int j = 0; j < matriz_ejemplo[0].length; j++) { // con esto es columnas

                System.out.println(matriz_ejemplo[i][j]);

            }

            System.out.println();

        } // asi imprimiremos cada fila de izquierda a derecha

        for (int j = 0; j < matriz_ejemplo[0].length; j++){// con esto es filas {

            for (int i = 0; i < matriz_ejemplo.length; i++) { // con esto es columnas

                System.out.println(matriz_ejemplo[i][j]);

            }

            System.out.println();

        } // asi imprimiremos cada columna de arriba a abajo

        for ( int fila[] : matriz_ejemplo){
            System.out.print(Arrays.toString(fila));
        }

        for (int fila[] : matriz_ejemplo){
            for (int columna : fila){
                System.out.println(columna);
            }
            System.out.println();
        } // esto es lo mismo que la impresion de filas que hemos hecho arriba

        int[] vector = {1,2,3,4};

        for (int num : vector){ // esto es un for each me trae elementos

            System.out.println(num);

        }

        String[][] nombres = new  String[2][3];

        for (int i = 0; i < nombres.length; i++) { // este es el metodo para llenar filas desde teclado sin especificar la fila a rellenar

            String[] fila = read.next().split(" ");

            if (fila.length == nombres[i].length){

                for (int j = 0; j < nombres[i].length; j++) {

                    nombres[i][j] = fila[j];

                }

            }else {

                System.out.println("El tamaño no es el adecuado");
                i--;

            }


        }

    }
}
