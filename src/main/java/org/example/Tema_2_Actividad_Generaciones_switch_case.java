package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Tema_2_Actividad_Generaciones_switch_case {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);


        final int ANYO_MINIMO = 1900;
        int modo = 0;
        int anyo_nacimiento_int = 0;

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();

        System.out.println("-------------------------");
        System.out.println("Elige un modo...");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] - Edad");
        System.out.println("-------------------------");

        if (read.hasNextInt()) {

            modo = read.nextInt();

        }

        switch (modo){

            case 1:

                System.out.println("Introduce el año de nacimiento : ");
                String anyo_nacimiento = read.next();

                try{

                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);

                }catch (NumberFormatException e){

                    System.out.println("El formato no es numérico. ");
                    return;

                }
                break;

            case 2:

                int edad = 0;
                System.out.println("Introduce la edad");

                if (read.hasNextInt()){

                    edad = read.nextInt();

                } else {

                    System.out.println("La edad no tiene el formato correcto (numérico)");
                    return;

                }

                if (edad >= 0 ) {

                    anyo_nacimiento_int = anyo_actual - edad;

                }else {

                    System.out.println("La edad no es correcta");
                    return;

                }
                break;

            default:

                System.out.println("Elige entre 1 y 2 porfavor");
                break;

        }

        if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual){

            if (anyo_nacimiento_int <= 1927){

                System.out.println("Generación sin bautizar");

            } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1944) {

                System.out.println("Generación silent");

            } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {

                System.out.println("Baby boomer");

            } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {

                System.out.println("Generación X");

            } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {

                System.out.println("Millenials los que se creen mejor");

            } else {

                System.out.println("Generación Z la mejor :D ");

            }
        }

    }

}
