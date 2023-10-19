package PrimeraEvaluacion.tema03.ejercicios;

public class Ejercicio26 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i < 31 ; i++) {
            suma = suma + i;
            System.out.println("resultado dentro de for: " + suma);
        }
        System.out.println();
        System.out.println("resultado fuera de for: " + suma);

        int producto = 1;
        for (int i = 1; i <31 ; i++) {
            producto = producto * i;


        }
        System.out.println("producto = " + producto);

    }
}
