package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_matrices_Space_invaders {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el numero de filas");
        int filas = read.nextInt();

        read.nextLine();

        String[][] mensaje = new String[filas][3];

        for (int i = 0; i < mensaje.length; i++) { // este es el metodo para llenar filas desde teclado sin especificar la fila a rellenar

            String[] fila = read.next().split("");

            if (fila.length == mensaje[i].length){

                for (int j = 0; j < mensaje[i].length; j++) {

                    mensaje[i][j] = fila[j];

                }

            }else {

                System.out.println("El tamaño no es el adecuado");
                i--;

            }


        }

        for (String[] fila : mensaje){
            System.out.println(Arrays.toString(fila));
        }

        for (int i = 0; i < mensaje[0].length; i++) {

            for (int j = 0; j < mensaje.length; j++) {

                System.out.print(mensaje[j][i]);

            }

        }

    }

}
