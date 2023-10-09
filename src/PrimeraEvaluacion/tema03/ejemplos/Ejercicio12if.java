package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Scanner;

public class Ejercicio12if {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una casa");
        System.out.println("1-Gryffindor");
        System.out.println("2-Hufflepuff");
        System.out.println("3-Slytherin");
        System.out.println("4-Revenclaw");
        int casa = teclado.nextInt();

        switch (casa){
            case 1:
                System.out.println("valentia");
                break;
            case 2:
                System.out.println("lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("intelecto");
                break;

            default:
                System.out.println("casa invalida");
        }

    }
}
