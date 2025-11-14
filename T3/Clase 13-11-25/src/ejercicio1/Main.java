package ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        1. Crea un programa de adivinación de números El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.
        0- necesito pedir
        1- Generar un aleatorio
        2- 7 intentos / repeticiones
        3. indicar si el numero es <o> del eligido
        4- mostrar un aviso acon el numero de intentos realizados.
         */
        System.out.println("Bienvenido al juego");
        System.out.println("Debes adivinar el numero que ha elegido la máquina");
        System.out.println("Está entre el 1 y el 50, tienes 7 intentos");
        Scanner scanner = new Scanner(System.in);
        int numeroSistema = (int) (Math.random()*50)+ 1; // un número entre 0-49, pq cuernta el 0 como el primer numero
        //System.out.println("el numero des sistema es "+numeroSistema);// el +1 es para que vaya de 1-50
        int intentos = 7;                                    // hay un casteo en (int) (math...) --> pq random devuelve doubles y yo lo que quiero son numeros enteros 0.0-49.999
        int numeroUsuario;
        boolean acierto = false;


        do {
            System.out.println("Indica el numero con el que juegas ");
            numeroUsuario = scanner.nextInt();
            intentos--;
            if (numeroSistema==numeroUsuario){
                System.out.println("Has acertado el numero");
                break;

                // return es la ultima linea del metodo pq lo para todoo



            }else {
                if (numeroSistema < numeroUsuario){
                    System.out.println("Numero demasiado grande");
                }else {
                    System.out.println("Numero demasiado pequeño ");
                }
            }
            // vas a pedir el numero 7 max min 1
            System.out.println("Has consumido "+(7-intentos));
        }while (intentos>0);


        //has perdido
        if (numeroSistema!= numeroUsuario){
            System.out.println("Has perdido");
        }







    }
}
