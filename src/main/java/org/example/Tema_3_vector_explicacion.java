package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_vector_explicacion {

    public static void main  (String[] args){

        Scanner read = new Scanner(System.in);

        int[] vector = {1,2,3,4,5};

        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        int[] vector2 = new int[8]; //El new int le da la longitud al vector y esta no es dinamica

        String[] vector3 = new String[6]; //El new int le da la longitud al vector y esta no es dinamica

        vector2 = vector; // este metodo no haqy que usarlo a la hora de pasar los valores de un vector a otro, con esta manera los dos cambian de valor

        vector[2] = 0; // esto es para cambiar el valor de la posición 2 del vector

        vector = vector2.clone(); // Asi es como se debe clonar un vector

        String vector2_cambio = Arrays.toString(vector2); // Aqui pasas el array a un string
        System.out.println(vector2_cambio);

        int[] vector4 = new int[9];

        for (int i = 0; i < vector4.length; i++){ // Con esto cambiamos los valores del vector con un for

            vector4[i] = i;


        }

        System.out.println(Arrays.toString(vector4));




    }

}
