package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class ejercicioVolteadorDeNumeros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("numero que quieres voltear: ");
         int numero = teclado.nextInt();

         if (numero >= 10 && numero <= 99) {

         int numero1 = numero / 10;
         int numero2 = numero % 10;


            System.out.println("el numero volteado:" + numero2+numero1 );
        } else {
            System.out.println("El número no tiene dos dígitos.");
        }
    }
}