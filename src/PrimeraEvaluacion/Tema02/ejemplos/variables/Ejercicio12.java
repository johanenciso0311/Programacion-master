package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el radio de la circuferencia");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2 );
        System.out.printf("Area de la circunferencia: %.2f" , area);
    }
}
