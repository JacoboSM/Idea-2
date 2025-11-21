package org.example;

import java.util.Scanner;

public class Tema_3_matrices_bateria1_ejercicio_3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuantos alumnos tienes? ");
        int alumnos = read.nextInt();

        System.out.println("¿Cuantas asignaturas cursan?");
        int asignaturas = read.nextInt();

        read.nextLine();

        String[][] notas = new String[alumnos+1][asignaturas+1];

        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {

            System.out.println("Estudiante " + i);
            notas[i][0] = read.next();

        }

        for (int i = 1; i < notas[0].length; i++) {

            System.out.println("Asignatura " + i);
            notas[0][i] = read.next();

        }


        for (int i = 1; i < notas.length; i++) {

            for (int j = 1; j < notas.length; j++) {

                System.out.println("Introduce la Nota del alumno " + notas[i][0]);
                notas[i][j] = read.next();

            }

        }

        int suma_nota = 0;

        for (int i = 1; i < notas.length; i++) {

            for (int j = 1; j < notas[i].length; j++) {

                suma_nota += Integer.parseInt(notas[i][j]);

            }

            System.out.println("La nota media del alumno " + notas[i][0] + " es " + (double) (suma_nota/asignaturas));
            suma_nota = 0;

        }


        for (int i = 1; i < notas[0].length; i++) {

            suma_nota = 0;
            for (int j = 1; j < notas.length; j++) {

                suma_nota += Integer.parseInt(notas[j][i]);

            }

            System.out.println("La nota media de la asignatura " + notas[0][i] + " es " + (double) (suma_nota/alumnos));

        }



        for (String[] fila :notas){

            for (String valor : fila){
                System.out.print(valor + " ");
            }

            System.out.println();

        }


    }

}
