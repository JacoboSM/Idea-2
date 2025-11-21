package org.example;

import java.util.Scanner;

public class Tema_3_array_Bateria1_Ejerecicio5 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int[] vector = {1,2,3,4,5};
        int[] vector2 = new int [vector.length];

        System.out.println(vector.length);

        int aux = vector[vector.length -1];


        for (int i = 0 ; i < vector2.length ; i++){

                if (i == 1){

                    vector2[1] = vector[aux];

                } else {

                    vector2[i] = vector[i + 1];

                }
        }

    }

}
