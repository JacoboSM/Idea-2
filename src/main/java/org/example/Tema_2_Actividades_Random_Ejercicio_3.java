package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema_2_Actividades_Random_Ejercicio_3 {

    public static void main (String[] args){

        Scanner read = new Scanner (System.in);
        Random random = new Random();

        System.out.println("¿Cual quieres que sea el maximo del rango?");
        int max = read.nextInt();

        System.out.println("¿Cual quieres que sea el minimo del rango?");
        int min = read.nextInt();

        System.out.println("¿Cuantos numeros aleatorios quieres?");
        int numeros = read.nextInt();

        for (int i = 1 ; i <= numeros  ; i++){

            int aleatorio = random.nextInt(max - min +1) +min;

            System.out.println("Este es el numero " + i + " : " + aleatorio);

        }

    }

}
