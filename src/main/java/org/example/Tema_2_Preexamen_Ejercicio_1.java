package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tema_2_Preexamen_Ejercicio_1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int numeros = 0;
        int cont_mas = 0;
        int cont_menos = 0;
        int cont_cero = 0;

        try{

            System.out.println("Dime cuantos numeros quieres poner");
            numeros = read.nextInt();
            if (numeros < 0){

                System.out.println("No puedes usar numeros negativos");
                return;
            }

        } catch (InputMismatchException e){

            System.out.println("Ponlo en numero porfa!");

        }


        for (int i = 1 ; i <= numeros ; i++){

            int aleatorio = random.nextInt();

            if (aleatorio > 0){

                cont_mas++;

            } else if (aleatorio < 0) {

                cont_menos++;

            } else{

                cont_cero++;

            }

        }

        System.out.println("Hay " + cont_mas + " numeros positivos" );
        System.out.println("Hay " + cont_menos + " numeros negativos" );
        System.out.println("Hay " + cont_cero + " ceros" );

    }

}
