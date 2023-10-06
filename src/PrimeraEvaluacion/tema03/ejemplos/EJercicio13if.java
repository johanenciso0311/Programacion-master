package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Scanner;

public class EJercicio13if {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una direccion");
        System.out.println("1-Arriba");
        System.out.println("2-Abajo");
        System.out.println("3-Isquierda");
        System.out.println("4-Derecha");
        int casa = teclado.nextInt();

        if(casa == 1 ){
            System.out.println("Arriba");
        }
        else if (casa == 2) {
            System.out.println("Abajo");
        }
        else if (casa == 3) {
            System.out.println("morver a la Izquierda");
        }
        else if (casa == 4){
            System.out.println("mover a la Derecha");
        }

        else {
            System.out.println("ERROR MI BRO");
        }
    }
}
