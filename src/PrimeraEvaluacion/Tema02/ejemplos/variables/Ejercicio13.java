package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("el lado de un cuadrado");
        double lado = teclado.nextDouble();
        double perimetro = lado * 4;
        System.out.printf("El perimetro del cuadrado es:" + perimetro);



    }
}
