package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio22 {
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
        double descuento = precioFinal * 15 / 100;
        double finaltotal = precioFinal - descuento;
        System.out.println();
        System.out.println();
        System.out.println("pero tienes un descuento del 15% tu total seria:" + finaltotal);

    }
}
