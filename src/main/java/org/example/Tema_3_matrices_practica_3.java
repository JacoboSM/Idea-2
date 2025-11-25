package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_matrices_practica_3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean pepe = true;
        String[] letras_dentro_fila = new String[4];
        letras_dentro_fila[2] = "1000";

        pepe:
        do {

            // Iniciamos el menu y definimos el ancho y el alto
            System.out.println("********* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *********");
            System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");
            System.out.println("Ancho:");
            int ancho = read.nextInt();
            System.out.println("Alto:");
            int alto = read.nextInt();


            // Verificamos que el ancho y el alto sean multiplos de 8, y menores o iguales que 48
            if ( ancho % 8 == 0 && alto % 8 == 0 && ancho > 48 && alto > 48){

                    // Inicializamos la matriz con él ancho y el alto
                    String[][] matriz  = new String[ancho][alto];

                    System.out.println("Introduce una (linea a linea) los colores de tu imagen para cada pixel: ");

                    // Empezamos a recorrer el bucle
                    for (int i = 0; i < matriz.length; i++) {

                        // Rellenamos el vector con los valores por pantalla y los separamos con el split
                        String[] vector = read.next().split("");

                        // Verificamos que los valores este entre A y O tanto mayusculas como minusculas con el .matches
                        if ( vector[i].matches("[a-oA-O]") ){

                            // Ahora vemos que el vector tenga exactamente 8 valores dentro
                            if (vector.length == matriz[i].length){

                                // recorremos la fila
                                for (int j = 0; j < matriz[i].length; j++) {

                                    // Aqui reseteamos los valores de nuestra auxiliar y ponemos el mil en la posicion 2 para que en caso de que fuera diferente mas adelante poder notificarlo
                                    if ( j == 7 || j == 15 || j == 23 || j == 31 || j == 39 || j == 47){

                                        letras_dentro_fila = new String[4];
                                        letras_dentro_fila[2] = "1000";

                                    }

                                    // Hacemos el boolean para que asi darnos cuenta de que hay o no mas de dos letras en el color
                                   boolean color_dentro = Arrays.asList(letras_dentro_fila).contains(matriz[i][j]);

                                    // Si eñ boolean es falso es que no tenemos esa letra aun por lo que la escribimos
                                    if (!color_dentro){

                                        letras_dentro_fila[i] = matriz[i][j];

                                    }

                                    // Aqui comprobamos que el valor en la posicion 2 siga siendo el default y si no dar el error
                                    if (!letras_dentro_fila[2].equals("1000")){

                                        System.out.println("Hay mas de dos letras!");
                                        continue pepe;

                                    }

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
