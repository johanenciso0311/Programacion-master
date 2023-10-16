package PrimeraEvaluacion.tema03.ejemplos;

import java.awt.font.FontRenderContext;

public class Ejerciciofor1 {
    public static void main(String[] args) {
        //UNA de las aplicacion de los bucle (for) es el ir acomulando, sumando, valores que se van generando en cada iteracion
       //EJEMPLO:queremos sumar todas los numeros que van del 1 al 1o. o sea, tengo que sumas (ambo inclusives 1 + 2 + 3 + ......)
        // el 1 , el 2, el 3 ..... son los valores de i en cada interacion
        //SOLO necesito añadir una variable que los vaya acumulando
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma = suma + i; //SUMA LO QUE TENGO EN LA VARIABLE SUMA HASTA ESE MOMENTO, LE AÑADE LO QUE VALE i EN ESA ITERRACION
            System.out.println("sumamos " + i + ": " + suma);

        }




    }


}
