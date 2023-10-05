package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Scanner;

public class Ejmploslf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿edad?");
        int edad = teclado.nextInt();
        if (edad >= 18)
        {
            System.out.println("puedes pasar a ver la peli.");
        }

        System.out.println("esto se imprime siempre,tanto si es true como si es false");

           boolean mayorDeEdad = edad >=18;
           if (mayorDeEdad){
               System.out.println("pues si");
           }

           if (!mayorDeEdad){
               System.out.println("no eres mayor de edad");
           }
    }

}
