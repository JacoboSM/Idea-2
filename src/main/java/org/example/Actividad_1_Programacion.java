package org.example;

import java.util.Scanner;

public class Actividad_1_Programacion {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("¿Como querrias llamarte? ");
        String name = read.nextLine();

        System.out.println("A que curso vas? ");
        String course = read.nextLine();

        System.out.println("Hola " + name + " Bienvenid@ al curso " + course);

        System.out.println("Dime el primer numero");
        int num1 = read.nextInt();

        System.out.println("Dime el segundo numero");
        int num2 = read.nextInt();

        // opción uno
        System.out.println("El resultado es " + (num1+num2));

        // opcion dos
        int resultado = num1 + num2;
        System.out.println("El resutado es " + resultado);


    }
}
