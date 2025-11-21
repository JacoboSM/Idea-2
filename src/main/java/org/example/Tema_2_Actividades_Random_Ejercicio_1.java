package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema_2_Actividades_Random_Ejercicio_1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(6) + 1;
        System.out.println("Este es el primer dado " + num1);

        int num2 = random.nextInt(6) + 1;
        System.out.println("Este es el segundo dado " + num2);

        int resultado = num1 + num2;
        System.out.println("La suma es " + resultado);

    }

}
