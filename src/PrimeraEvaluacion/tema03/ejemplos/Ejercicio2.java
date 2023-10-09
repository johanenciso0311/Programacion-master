package PrimeraEvaluacion.tema03.ejemplos;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("nuemro 1:");
        int numero1 = teclado.nextInt();
        System.out.println("numero 2:");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2){
            System.out.println("es mayor que  ");
        }
        else {
            System.out.println("no es mayor que ");
        }

    }
}
