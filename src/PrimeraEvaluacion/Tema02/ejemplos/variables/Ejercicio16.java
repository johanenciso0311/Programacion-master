package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa las cordenadas de (x1): ");
        double x1 = teclado.nextDouble();
        System.out.println("ingresa las cordenadas de (x1): ");
        double y1 = teclado.nextDouble();
        System.out.println("ingresa las cordenadas de (x1): ");
        double x2 = teclado.nextDouble();
        System.out.println("ingresa las cordenadas de (x1): ");
        double y2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 ,2));

        System.out.printf("distancia: %.2f", distancia);


    }
}
