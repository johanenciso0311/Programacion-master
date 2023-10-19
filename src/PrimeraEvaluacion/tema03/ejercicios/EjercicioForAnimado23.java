package PrimeraEvaluacion.tema03.ejercicios;

import java.util.Scanner;

public class EjercicioForAnimado23 {
    public static void main(String[] args) {



            Scanner teclado = new Scanner(System.in);

            System.out.print("Introduce un número n: ");
            int n = teclado.nextInt();

            System.out.print("Introduce un carácter para dibujar el cuadrado: ");
            char caracter = teclado.next().charAt(0);


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(caracter + " ");
                }
                System.out.println(); // Salto de línea al final de cada fila
            }
        }
    }


