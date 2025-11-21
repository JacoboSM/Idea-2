package org.example;

import java.util.Scanner;

public class Practica_3_La_Bascula_del_feriante_de_Rabasa {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        int minimo = 140;
        int maximo = 120;

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        System.out.println("Leyendo altura (cm)...");
        int altura = read.nextInt();

        if (altura < 140){

            int falta = minimo - altura;
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan" + falta + "cm de altura" );

        } else if (altura > 230 || altura < 0 ) {

            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR");

        }

        System.out.println("Leyendo peso (kg)...");

        double peso = read.nextDouble();
        double pminimo =  (altura * 2) / 8;
        double resultado = (peso - pminimo) * -1;

        if (peso <= maximo && peso >= pminimo ) {

            System.out.println("Pesas" + peso + "kg. Peso mínimo calculado : " + pminimo);
            System.out.println("¡¡SUBE A LA ATRACCIÓN!!");

        } else if (peso > maximo) {

            double resultado2 = peso - maximo;
            System.out.println("LO SIENTO. Sobrepasas " + resultado2 + "kg el límite de la atracción");

        }


    }

}
