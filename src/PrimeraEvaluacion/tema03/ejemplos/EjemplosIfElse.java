package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Scanner;

public class EjemplosIfElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("edad? :");
        int variable = teclado.nextInt();

        if (variable >= 16 &&  variable <= 64)  {
            System.out.println(" puedes trabajar ");
        }



        else if (variable < 16){
                 System.out.println("lo siento no puedes trabajar");
             }
         else if (variable >64 ) {
            System.out.println("lo siento no puedes trabajar, ya estas pensionado ");}


    }

}
