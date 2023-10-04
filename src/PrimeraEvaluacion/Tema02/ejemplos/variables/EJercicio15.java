package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class EJercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("temperatura en grados centigrados")
        ;
        double gradosC = teclado.nextDouble();
        double gradosR = gradosC * 0.8;
        double gradosF = (gradosC * 9/5 ) + 32;
        double gradosK = gradosC + 273;

        System.out.printf("Reamur: %.2f \n",gradosR);
        System.out.printf("Farenheit: %.2f \n", gradosF);
        System.out.printf("Kelvin: %.2f \n", gradosK );
    }
}
