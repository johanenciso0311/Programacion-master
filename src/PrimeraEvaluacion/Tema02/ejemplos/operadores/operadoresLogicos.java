package PrimeraEvaluacion.Tema02.ejemplos.operadores;

public class operadoresLogicos {
    public static void main(String[] args) {
        // el  operador not (!) invierte el valor de la variable a la que afecta
        //los operados logicos trabajan con dan y como resultado variables boolean

        boolean variable = true;
        System.out.println(variable); //true
        variable = !variable;
        System.out.println(variable); //false
        System.out.println("*** and  ***");

        // los operadores binarios and,or y not

        boolean v1= true;
        boolean v2 = true;
        boolean resultadoAnd = v1 && v2;
        boolean resultadoOr = v1 || v2;
        System.out.println("true\ttrue"); // \t mete una matubulacion en la string o cadena de caracteres
        System.out.println(resultadoAnd);
        System.out.println(resultadoOr);

        System.out.println("\ntrue\tfalse");
        v2 = false;
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd);
        System.out.println(resultadoOr);
        System.out.println();
        v1 = false;
        v2 = true;
        System.out.println("\nfalse\ttrue");
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd);
        System.out.println(resultadoOr);
        System.out.println("\nfase\tfalse");


        v1 = false;
        v2 = false;
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd);
        System.out.println(resultadoOr);
    }
}
