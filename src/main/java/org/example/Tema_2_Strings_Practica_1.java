package org.example;

import java.util.Scanner;

public class Tema_2_Strings_Practica_1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        // Inicializo estas variables para poder usarlas dentro del do
        int dia_num = 0;
        int mes_num = 0;
        int anyo_num = 0;

        // Abro el do ( bucle )
        do {

            // Pido la fecha
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa) : ");
            String fecha = read.nextLine();


            //Preparo los boolean que me servirán en el if de abajo para comprobar que las barras esten en los espacios 2 y 5 y que la String tenga un length de 10
            boolean longitud = fecha.length() == 10;
            boolean barra1 = fecha.charAt(2) == '/';
            boolean barra2 = fecha.charAt(5) == '/';

            // Reseteo las variables en caso de que se repita el bucle
            dia_num = 0;
            mes_num = 0;
            anyo_num = 0;



            // El if me limpia las opciones de que la fecha tenga un mal formato
             if (barra1 && barra2 && longitud){

                 // Este try catch me sirve para poder comprobar que haya numeros como valores dentro de la variable fecha
                 try{

                        // En estas variables declaro que rango tienen coger para diferenciar los valores de dia/mes/anyo
                        String dia = fecha.substring(0,2);
                        String mes = fecha.substring(3,5);
                        String anyo = fecha.substring(6,10);

                        // Ahora paso las variables con datos String a otras variables conviertiendo los Strings en valores Int
                        dia_num = Integer.parseInt(dia);
                        mes_num = Integer.parseInt(mes);
                        anyo_num = Integer.parseInt(anyo);

                 // Aqui cierro el catch y pongo la frase en el caso del fallo
                 } catch (NumberFormatException e){
                     System.out.println("Utiliza solo numeros");
                     break;
                 }

                 // Aqui meto el else if para limpiar datos que sean mayores o menores a los que pido
             }else if (

                     ( dia_num <= 0 || dia_num > 31) ||
                             ( mes_num <= 0 || mes_num > 12) ||
                             ( anyo_num <= 1900 || anyo_num > 2026 )

             ) {

                 // Aqui sumo los valores para sacar el numero final el cual dividire en valores independientes para sacar el numero de la suerte y luego los saco por pantalla
                 int resu = dia_num + mes_num + anyo_num;
                 System.out.println(" " + dia_num + " " + mes_num + " " + anyo_num + " = " + resu );

                 // Aqui paso el valor en numero a un String para poder dividirlo con el mismo metodo de antes
                 String resu_string = Integer.toString(resu);

                 // Divido los cuatro numeros segun su posición en 4 variables para sumarlos independientemente
                 String num1 = resu_string.substring(0,1);
                 String num2 = resu_string.substring(1,2);
                 String num3 = resu_string.substring(2,3);
                 String num4 = resu_string.substring(3,4);

                 // Paso los numeros String a numeros Int igual que hice mas arriba
                 int num1_num = Integer.parseInt(num1);
                 int num2_num = Integer.parseInt(num2);
                 int num3_num = Integer.parseInt(num3);
                 int num4_num = Integer.parseInt(num4);

                 // Creo una variable llamada suerte que es la suma de los numeros que he sacado del numero final antes
                 int suerte = num1_num + num2_num + num3_num + num4_num;

                 // Imprimo los numeros en solitario por la pantalla
                 System.out.println(" " + num1_num + " + " + num2_num + " + " +num3_num + " + " + num4_num + " = " + suerte );

                 // Saco por pantalla el resultado del numero de la suerte
                 System.out.println("Tu número de la suerte es " + suerte);

                 // Cierro el if de arriba del todo con un mensaje por pantalla para que no me pongan la barra
             } else {
                 System.out.println("Tienes que usar / para separar!");
             }

             // Este es el bucle del do
        } while (

                        ( dia_num <= 0 || dia_num > 31) ||
                        ( mes_num <= 0 || mes_num > 12) ||
                        ( anyo_num <= 1900 || anyo_num > 2026 )

        );

    }

}
