package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el numero: ");
        int numero = teclado.nextInt();

        int primero = numero / 100;
        int segundo = (numero / 10) % 10 ;
        int tercero = numero % 10 ;



        System.out.println(tercero + "" + segundo + "" + primero);
    }
}
