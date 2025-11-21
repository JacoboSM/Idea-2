package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema_2_Strings_Practica_3 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int opcion = 0;


        System.out.println("Hola, Este es el programa de validación y correción de ISBN's");

        System.out.println(" ");

        System.out.println("*************************************");
        System.out.println("1 - Validar ISBN ");
        System.out.println("2 - Corregir ISBN ");
        System.out.println("3 - Salir");
        System.out.println("*************************************");


        System.out.println(" ");



        try{

            System.out.println("¿Que opción quieres utilizar?");
            opcion = read.nextInt();

        }catch (InputMismatchException e){

            System.out.println("Elige entre las 3 opciones porfavor");
            return;

        }

        if (opcion > 3 || opcion < 1){

            System.out.println("Elige entre las 3 opciones porfavor");
            return;
        }



        System.out.println(" ");

        if (opcion == 1){

            System.out.println("Has elegido Validar!");

            System.out.println("Escribe tu ISBN");
            String isbn = read.next();

            if (isbn.length() < 10 | isbn.length() > 10 ){

                System.out.println("El ISBN esta compuesto de 10 numeros o de 9 numeros y una letra ");
                return;

            }else {

                if (isbn.matches("\\d{10}")){

                    int isbn_num = Integer.parseInt(isbn);

                    for (int i = 10; i <= 1; i--){



                    }

                } else if (isbn.matches("\\d{9}[Xx]")) {


                }
                    
                }

            }

        if (opcion == 2){

            System.out.println("Has elegido corregir");

            System.out.println("Escribe tu ISBN");
            String isbn2 = read.next();

            if (isbn2.length() < 10 | isbn2.length() > 10 ){



            }

        }

        if (opcion == 3){

            System.out.println("Gracias por utilizar nuestro comprobaar y corrector de ISBN's");

        }

    }

}
