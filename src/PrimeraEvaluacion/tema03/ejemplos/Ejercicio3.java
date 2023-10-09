package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int mayor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("numero 1:");
        int numero1 = teclado.nextInt();
        mayor = numero1;
        System.out.println("numero 2:");
        int numero2 = teclado.nextInt();
        if (numero2 > mayor){
            mayor = numero2;
        }

        System.out.println("numero 3:");
        int numero3 = teclado.nextInt();

        if (numero3 > mayor){
            mayor = numero3;
        }

        System.out.println("numero 4:");
        int numero4 = teclado.nextInt();
        if (numero4 > mayor){
            mayor = numero4;
        }

        System.out.println("numero 5:");
        int numero5 = teclado.nextInt();
        if (numero5 > mayor){
            mayor = numero5;
        }
        System.out.println("el numero mayor es: " + mayor);



       /*
       if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5){
            System.out.println("el numero 1 es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
            System.out.println("el nuemro 2 es el mayor");
        }
        else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5) {
            System.out.println("el nuemro 3 es el mayor");
        }
        else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
            System.out.println("el nuemro 4 es el mayor");}
        else if (numero5 > numero1 && numero5 > numero2 && numero5 > numero4 && numero5 > numero3) {
            System.out.println("el nuemro 5 es el mayor");}
        */


    }

}
