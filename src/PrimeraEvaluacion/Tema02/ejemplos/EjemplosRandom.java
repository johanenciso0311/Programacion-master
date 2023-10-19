package PrimeraEvaluacion.Tema02.ejemplos;

import java.util.Random;

public class EjemplosRandom {
    public static void main(String[] args) {
        // la clase random sirve para generar numeros al azaar
        Random generador = new Random();
         int numero = generador.nextInt( 10);
         for (int i =  0; i < 100; i++)
         {
             System.out.print(numero + " ");
             numero = generador.nextInt(10);
             numero = generador.nextInt(1, 11);
         }


        System.out.println("50 numero entre -10 y 11");
         for (int i = 0; i < 50; i++){
             System.out.print(generador.nextInt(-10,11) + " ");
         }
}}
