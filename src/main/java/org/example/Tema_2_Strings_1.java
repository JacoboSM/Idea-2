package org.example;

public class Tema_2_Strings_1 {

    public static void main (String[] args) {

        String frase = "Al palo JuanFran del Atleti palo";

        int tamanyo = frase.length();

        System.out.println(tamanyo);

        System.out.println(frase.charAt(8));

        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        String trozo_final = frase.substring(16);
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo",10 );
        System.out.println(posicion2);

        int posicion_utimo = frase.lastIndexOf("palo");
        System.out.println(posicion_utimo);

        String frase_miniusculas = frase.toLowerCase();
        System.out.println(frase_miniusculas);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        String base_datos = "Raúl                     ";
        System.out.println(base_datos.trim() + " - " + base_datos + "#");

        boolean igual = base_datos.equals("Raúl");
        System.out.println(igual);

        boolean igual_sin_mayusculas = "Raúl".equalsIgnoreCase("Raúl");
        System.out.println(igual_sin_mayusculas);

        String frase_remplazos =frase.replace("palo","Florentino");
        System.out.println(frase_remplazos);

        String equipo = "Real Madrid";

        System.out.println(frase.concat(equipo));
        System.out.println(frase+equipo);

        boolean esta = frase.contains("albaricoque");
        System.out.println(esta);


    }

}
