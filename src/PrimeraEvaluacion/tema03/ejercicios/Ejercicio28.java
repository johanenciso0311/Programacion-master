package PrimeraEvaluacion.tema03.ejercicios;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n =teclado.nextInt();

        for (int i = 5; i <= n; i = i + 5) {

                System.out.print(i + " ");

        }
    }
}
