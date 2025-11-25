package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_matrices_practica_3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean pepe = true;
        String[] letras_dentro_fila = new String[4];

        pepe:
        do {

            System.out.println("********* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *********");
            System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");
            System.out.println("Ancho:");
            int ancho = read.nextInt();
            System.out.println("Alto:");
            int alto = read.nextInt();


            if ( ancho % 8 == 0 && alto % 8 == 0){

                    String[][] matriz  = new String[ancho][alto];

                    System.out.println("Introduce una (linea a linea) los colores de tu imagen para cada pixel: ");

                    for (int i = 0; i < matriz.length; i++) {

                        String[] vector = read.next().split("");

                        if ( vector[i].matches("a-oA-O") ){

                            if (vector.length == matriz[i].length){

                                for (int j = 0; j < matriz[i].length; j++) {

                                    if (j == 7 || j == 15 || j ==23 || j == 31 || j == 39 || j == 47){

                                        letras_dentro_fila = new String[4];

                                    }

                                   boolean color_dentro = Arrays.asList(letras_dentro_fila).contains(matriz[i][j]);

                                    if (!color_dentro){

                                        letras_dentro_fila[i] = matriz[i][j];

                                    }

                                    if ( !letras_dentro_fila[2].equals(""))

                                    matriz[i][j] = vector[i];

                                }

                            } else {

                                System.out.println("El ancho o el alto no son aptos! Vuelve a intentarlo");
                                continue pepe;

                            }

                        } else {

                            System.out.println("La letra introducida no esta entre : A y O");
                            continue pepe;

                        }

                    }





            pepe = false;

            } else {

                System.out.println("El ancho o el alto no son aptos! Vuelve a intentarlo");

            }





        }while (pepe);


    }

}
