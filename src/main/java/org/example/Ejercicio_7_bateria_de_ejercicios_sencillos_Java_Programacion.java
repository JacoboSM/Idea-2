package org.example;

import java.util.Scanner;

public class Ejercicio_7_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args){

        int compra = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("Vamos a hacer la lista de la compra");

        System.out.println("¿ Tenemos tomates (S/N)?");
        char tomates = read.next().charAt(0);

        System.out.println("¿ Tenemos aceite (S/N)?");
        char aceite = read.next().charAt(0);

        System.out.println("¿ Tenemos jamon (S/N)?");
        char jamon = read.next().charAt(0);

        if (tomates == 'N' || aceite == 'N' || jamon == 'N'){

            System.out.println("A comprar!!");

        }else {
            System.out.println("No comprar!!");
        }
    }
}
