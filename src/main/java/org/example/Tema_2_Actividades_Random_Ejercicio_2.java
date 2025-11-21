package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema_2_Actividades_Random_Ejercicio_2 {

    public static void main (String[] args){

        Scanner read = new Scanner (System.in);
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String key = "";

            for (int i=0;i<12;i++){

                key += caracteres.charAt(random.nextInt(caracteres.length()-1));

            }

        System.out.println(key);
    }
}
