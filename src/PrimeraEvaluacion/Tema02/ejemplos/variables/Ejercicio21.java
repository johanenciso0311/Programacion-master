package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("precio de venta de un producto");
         double precio = teclado.nextDouble();
        System.out.println("cantidad de productos");
        double cantidad = teclado.nextDouble();
        System.out.println("porcentaje de iva");
        double iva = teclado.nextDouble();
        double precioprincipal = precio * cantidad;

        double importetotal = precioprincipal * (iva/100);
        double precioFinal = precioprincipal + importetotal;
        System.out.println("precio fianl:" + precioFinal);

    }
}
