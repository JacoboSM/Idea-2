package org.example;

import java.util.Scanner;

public class Tema_2_CosasHasNextInt {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        if (read.hasNextInt()){

            int num = read.nextInt();
            System.out.println(num);

        } else {
            System.out.println("Formato incorrecto. No es un número.");
        }



    }

}
