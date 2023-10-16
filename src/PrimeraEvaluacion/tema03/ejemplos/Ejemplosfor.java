package PrimeraEvaluacion.tema03.ejemplos;

import java.awt.font.FontRenderContext;

public class Ejemplosfor {
    public static void main(String[] args) {

        for (int i = 0; //aqui inicializamos la variable del bucle
             i < 5; //condicion: mientraas sea true el resultado de la condicion, seguriremos en el bucle
             i = i+2) { //modificacion: a ca ponesmos algo que modifique cada intereacion el valor de i,para que alguna vez sea false la condicion y podamos salir del bucle
            System.out.println("hola");

        }
        System.out.println("cuando finaliza el programa sigue por aca ");

        for (int i = 0; i < 10; i++) {
            System.out.print( i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10 ; i++) {

            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <=20 ; i++) {
            System.out.print(i + " ");

        }

        System.out.println();

        for (int i = 10; i > 0 ; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
        // los nuemeros de la inicializaacion,etc. pueden ser variables
        int inicio = 0;
        int fin = 10;
        for (int i = inicio; i < fin; i++) {
            System.out.print(i + " ");

        }
        System.out.println();


    }
}
