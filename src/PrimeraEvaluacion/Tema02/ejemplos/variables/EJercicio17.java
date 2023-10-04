package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class EJercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int suma = num1 + num2 + num3 + num4;
        double media = suma / 4.0;
        System.out.println("suma:" + suma);
        System.out.println("media:" + media);




    }
}
