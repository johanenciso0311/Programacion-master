package PrimeraEvaluacion.tema03.ejemplos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String user = "johan";
        String password = "johan0311";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("contraseña: ");
        String contraseña = teclado.nextLine();

        if (usuario.equals(user) && contraseña.equals(password)) {
            System.out.println("has entrado al sistema");

        } else if (usuario.equals(user) && !password.equals(contraseña)) {
            System.out.println("contraseña in conrecta ");
        } else if (!usuario.equals(user) && password.equals(contraseña)) {
            System.out.println("usuario in conrecta ");
        } else
        {
            System.out.println("incorreto contraseña y usuario");
        }
    }
    }
