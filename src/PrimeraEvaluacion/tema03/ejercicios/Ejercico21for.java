package PrimeraEvaluacion.tema03.ejercicios;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Ejercico21for {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("a: ");
        int a = teclado.nextInt();
        System.out.println("b: ");
        int b = teclado.nextInt();

        int max;
        int min;
        // tengo que decrar estas varaibles fuera de if, si no no sin visibles desde dentro de for; en general, las variables que creamos dentro de un bloque {} 0, en u for (), no van apoderse utilizar (no son visibles) fuera de ese bloque

        if (a >b){
             max = a;
             min = b;
        } else {
             max = b;
             min = a;
        }

        int suma =  0 ;
        for (int i = min; i <= max; i++){
            suma = suma  + i;

        }

        System.out.println("LA SUMA DESDE LOS NUMEROS  " + max + " y " + min + " es: " + suma);

    }
}
