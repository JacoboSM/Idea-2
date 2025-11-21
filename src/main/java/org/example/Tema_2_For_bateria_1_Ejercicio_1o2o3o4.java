package org.example;

import java.util.Scanner;

public class Tema_2_For_bateria_1_Ejercicio_1o2o3o4 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        // 1
        String buena = "admin1234";

        do {


            System.out.println("Introduce tu contraseña :");
            String contrasenya = read.next();

            if (contrasenya.equals(buena)){

                break;

            }


        }while (true);

        //2
        int n = read.nextInt();

        for (int i = n ; i > 0 ; i-- ){

            System.out.println(i);



        }

        //3
        for (int i = 1; i<=50 ; i++){

            if (i % 3 == 0){

                continue;

            }

            System.out.println(i);

        }

        //4
        System.out.println("Introduce una palabra...");
        String palabra = read.next();

        int letras = palabra.length();

        for (int i = letras - 1 ; i >= 0 ; i-- ) {

            System.out.println(palabra.charAt(i));

        }

    }

}
