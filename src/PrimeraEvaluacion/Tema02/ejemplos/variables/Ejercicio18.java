package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primera evaluacion: ");
        int eval1 = teclado.nextInt();
        System.out.println("segunda evaluacion: ");
        int eval2 = teclado.nextInt();
        System.out.println("tercera evaluacion: ");
        int eval3 = teclado.nextInt();

        double suma = eval1 + eval2 + eval3;
        double media = suma / 3.0;
        System.out.printf("nota final: %.1f", media );

    }
}
