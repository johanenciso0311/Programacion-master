package PrimeraEvaluacion.tema03.ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int producto = 1;

        for (int i = 1; i <= numero ; i++) {
            producto = producto * i;
            System.out.println("resultado: " + producto);

        }


    }
}
