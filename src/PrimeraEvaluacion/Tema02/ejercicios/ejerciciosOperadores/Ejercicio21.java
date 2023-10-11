package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("precio de venta del producto: ");
        double precio = teclado.nextDouble();
        System.out.println("cantidad de productos comprados: ");
        int cantidadDeProductos = teclado.nextInt();
        System.out.println("porcentaje de IVA: ");
        int iva = teclado.nextInt();

        double precioSinIva = precio + cantidadDeProductos;

        double ivaSumar = precioSinIva * iva /100.0;

        System.out.println("precio total: " + ivaSumar);


    }
}
