package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_array_Bateria1_Ejerecicio4 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int[] vector = {1,2,3,4,5};
        int[] vector2 = new int [vector.length -1];
        int num = 0;
        boolean pepe = false;

        do {

            System.out.println(Arrays.toString(vector));

            System.out.println("Que posicion quieres eliminar?");

            num = read.nextInt();

            if (num <0 | num > 4){

                System.out.println("Elige uno de entre los que te muestro");
                continue;

            }else {

                pepe = true;

            }

        }while (!pepe);

        for (int i = 0 ; i < vector2.length ; i++){

            if (i >= num){

                vector2[i] = vector[i + 1];

            } else {

                vector2[i] = vector[i];

            }

        }

        System.out.println(Arrays.toString(vector2));

    }

}
