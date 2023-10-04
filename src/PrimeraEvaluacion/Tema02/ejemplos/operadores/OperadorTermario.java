package PrimeraEvaluacion.Tema02.ejemplos.operadores;

import java.util.Scanner;

public class OperadorTermario {
    public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
    String cadena = numero % 2 == 0 ? "es numero par" : "es numero impar";

    System.out.println(numero + cadena);


}

}
