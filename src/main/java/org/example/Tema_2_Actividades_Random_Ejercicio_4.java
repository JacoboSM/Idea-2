package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema_2_Actividades_Random_Ejercicio_4 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int min = 8;
        int max = 12;

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String key = "";

        int num = random.nextInt(max - min +1 ) + min;

        for (int i=0;i<num;i++){

            key += caracteres.charAt(random.nextInt(caracteres.length()-1));

        }

        System.out.println(key);


    }

}
