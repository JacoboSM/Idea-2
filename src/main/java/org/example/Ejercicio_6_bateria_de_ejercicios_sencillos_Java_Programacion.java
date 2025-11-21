package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_6_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        double h = 0;
        double b = 0;
        boolean control = true;

        do {

            try {

                System.out.println("Dime la base del triangulo");
                b =read.nextDouble();

                if (b <= 0){

                    System.out.println("El valor de la base tiene que ser positivo");

                } else {

                    control = false;
                }

            } catch (InputMismatchException e) {

                System.out.println("Introduce solo numeros por favor");
                read.nextLine();

            }

        }while (control);

        control = true;

        do {

            try {

                System.out.println("Dime la altura del triangulo");
                h =read.nextDouble();

                if (h <= 0){

                    System.out.println("El valor de la altura tiene que ser positivo");

                } else {

                    control = false;
                }

            } catch (InputMismatchException e) {

                System.out.println("Introduce solo numeros por favor");
                read.nextLine();

            }

            }while (control);

        double area = (b * h) / 2;
        System.out.println("El area del triangulo es " + area);

        }
    }

