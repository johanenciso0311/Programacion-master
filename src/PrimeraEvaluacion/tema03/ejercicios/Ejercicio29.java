package PrimeraEvaluacion.tema03.ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("NUMERO BASE: ");
        int base = teclado.nextInt();
        System.out.println("Exponente: ");
        int exponente = teclado.nextInt();
         int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;


        }
        System.out.println(base + " ^ " + exponente + " = " + resultado);
    }
}

