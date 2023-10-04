package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class ejercicioSegundo6 {
    public static void main(String[] args) {
        System.out.printf("convertidor de segundos");
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("segundos:");

        int segundostotal = teclado.nextInt();

        int horas = segundostotal / 3600;

        System.out.println("horas:" + horas );

        int minutos = segundostotal % 3600 / 60 ;


        System.out.println("minutos: " + minutos);

        int segundos = segundostotal % 60;

        System.out.println("segundos: " + segundos );

    }

}
