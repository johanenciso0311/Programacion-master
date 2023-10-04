package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("NUMERO: ");
        double numero = teclado.nextDouble();
        System.out.println("porcentaje: (por ejemplo,20)");
        double porcentaje = teclado.nextDouble();
        double porcentajCalculado = numero * porcentaje / 100;
        System.out.println("EL " + porcentaje + "% de " + numero + " es " + porcentajCalculado);
        double numeroIncrementado = numero + porcentajCalculado;
        System.out.println(numero + " incrementado un " + porcentaje + " % es " + numeroIncrementado);
        double numeroDECREMENTADO = numero - porcentajCalculado;
        System.out.println(numero + " decremento " + porcentajCalculado + " % es " + numeroDECREMENTADO );


    }
}
