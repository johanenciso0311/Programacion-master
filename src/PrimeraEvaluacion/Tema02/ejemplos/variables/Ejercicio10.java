package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("importe de billetes: ");
        int euros = teclado.nextInt();
         int bellete500= euros / 500;
        System.out.println(bellete500 + " billetes de 500");
        int resto = euros % 500;
        System.out.println(resto);
        int billetes200 = resto / 200;
        System.out.println(billetes200 + " billetes de 200");
        resto = resto % 200;
        System.out.println(resto);
        int billetes100 = resto / 100;
        System.out.println(billetes100 + " billetes de 100");
        resto = resto % 100;
        System.out.println(resto);
        int billete50 = resto / 50;
        System.out.println(billete50 + " billetes de 50");
        resto = resto % 50;
        System.out.println(resto);
        int billete20 = resto / 20;
        System.out.println(billete20 + " billetes de 20");
        resto = resto % 20;
        System.out.println(resto);
        int billete10 = resto / 10;
        System.out.println(billete10 + " billetes de 10");
        resto = resto % 10;
        System.out.println(resto);
        int billete5 = resto / 5;
        System.out.println(billete5 + " billete de 5");
        resto = resto % 5;
        System.out.println(resto);
        int moneda2 = resto / 2;
        System.out.println(moneda2 + " moneda de 2");
        resto = resto % 2;
        System.out.println(resto);
        int moneda1 = resto / 1;
        System.out.println(moneda1 + " moneda de 1");
        resto = resto % 1;
        System.out.println(resto);




    }
}
