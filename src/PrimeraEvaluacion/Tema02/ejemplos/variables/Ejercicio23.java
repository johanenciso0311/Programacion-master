package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
            // Crear un objeto Scanner para obtener la entrada del usuario
            Scanner teclado= new Scanner(System.in);


            // Solicitar al usuario ingresar el sueldo base del vendedor
            System.out.print("Ingrese el sueldo base del vendedor: ");
            double sueldoBase = teclado.nextDouble();

            // Solicitar al usuario ingresar los montos de las tres ventas
            System.out.print("Ingrese el monto de la primera venta: ");
            double venta1 = teclado.nextDouble();

            System.out.print("Ingrese el monto de la segunda venta: ");
            double venta2 = teclado.nextDouble();

            System.out.print("Ingrese el monto de la tercera venta: ");
            double venta3 = teclado.nextDouble();

            // Calcular la comisión (10% del total de ventas)
            double totalVentas = venta1 + venta2 + venta3;
            double comision = 0.10 * totalVentas;

            // Calcular el total a cobrar (sueldo base + comisión)
            double totalCobrar = sueldoBase + comision;

            // Mostrar los resultados
            System.out.println("El monto de comisiones a recibir es: " + comision);
            System.out.println("El total a cobrar es: " + totalCobrar);

            // Cerrar el scanner



        }
    }


