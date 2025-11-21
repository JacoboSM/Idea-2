package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_vector_pureba1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int[] vector = {1,2,3,4,5,6,7,8,9,10};

        for (int i = vector.length -1; i >= 0 ; i--){

            System.out.println(vector[i]);

        }


        for (int a = 0 ; a< vector.length; a++){

            vector[a]= random.nextInt(501);

        }

        System.out.println(Arrays.toString(vector));

        int[] vector3 = new int [4];


        for  (int i = 0; i < vector3.length ; i++){

            vector3[i] = read.nextInt();

        }

    }

}
