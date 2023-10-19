package PrimeraEvaluacion.tema03.ejercicios;

import java.util.Random;

public class Ejercicio22for {
    public static void main(String[] args) {
        Random random = new Random();
        double suma = 0;
        double media;

            for (int i = 0; i < 10; i++) {
                double numeroAleatorio = random.nextDouble() * 100; // Números aleatorios entre 0 y 100
                suma += numeroAleatorio;
            }

            media = suma / 10;

            System.out.println(suma);
            System.out.println(media);
        }
    }





