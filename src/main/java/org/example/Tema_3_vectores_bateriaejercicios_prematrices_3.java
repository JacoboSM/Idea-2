package org.example;

import java.util.Scanner;

public class Tema_3_vectores_bateriaejercicios_prematrices_3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Dime el numero maximo...");
        int max = read.nextInt();
        int suma = 0;
        int i = 0;
        int j = 0;

        pepe:
        for ( i = 1; i <= 9; i++){


            for ( j = 1; j <= 10; j++){


                suma = i * j;
                System.out.println(i + " x " + j + " = " + suma);
                if (suma > max ){

                    break pepe;
                }


            }

        }




    }

}
