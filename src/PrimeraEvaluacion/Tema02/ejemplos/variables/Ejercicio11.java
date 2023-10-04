package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        // formla 2 * PI * r
        double longitud = 2 * Math.PI * radio;
        System.out.printf("longitud de la circunferencia: %.2f", longitud );



    }
}
