package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Formattable;
import java.util.Scanner;

public class EjercicioFor20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero A:");
        int numeroA = teclado.nextInt();
        System.out.println("numero B");
        int numeroB = teclado.nextInt();
        if (numeroA > numeroB) {
            System.out.println("error el numero A debe ser menor que B");

        }
            else {

        int suma = 0;
        for (int i = numeroA; i <= numeroB ; i++) {
            suma += i;
        }
        System.out.println(suma);
        }}
    }

