package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.println("numero es par");

        }

        else {
            System.out.println("no es par ");
        }
    }
        }
