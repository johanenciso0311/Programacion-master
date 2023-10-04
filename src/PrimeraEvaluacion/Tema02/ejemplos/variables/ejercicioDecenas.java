package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class ejercicioDecenas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("buscador de decimales para dos digitos:  ");

        int numero = teclado.nextInt();

        if (numero >= 10 && numero <= 99) {
            int decenas = numero / 10;
            System.out.println("Las decenas son: " + decenas);
        } else {
            System.out.println("El número no tiene dos dígitos.");
        }





    }

}
