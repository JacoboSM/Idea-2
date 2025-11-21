package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema_3_array_Bateria1_Ejerecicio1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int[] vector1 = new int [8];
        int contador = 0;

        for (int i = 0 ; i < vector1.length ; i++ ){

            vector1[i]= random.nextInt(501);

            contador += vector1[i];

        }




    }

}
