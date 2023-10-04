package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio14
{
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("base");
        double base = Teclado.nextDouble();
        System.out.println("altura");
        double altura = Teclado.nextDouble();
        double area = base * altura / 2;
        System.out.println("area del triangulo: " + area);
    }
}
