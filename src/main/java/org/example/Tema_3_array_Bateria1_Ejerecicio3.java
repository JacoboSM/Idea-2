package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema_3_array_Bateria1_Ejerecicio3 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int[] vector = new int [25];
        int cont = 0;

        for (int i = 0 ; i < vector.length ; i++){

            vector[i]= random.nextInt(101);

        }

        System.out.println("Dime un numero de 0 a 100");

        int preg = read.nextInt();

        for (int i = 0 ; i < vector.length ; i++){

            if (vector[i] == preg){

                cont++;

            }

        }

        System.out.println("El numero " + preg + " aparece " + cont + " veces en el array");

    }

}
