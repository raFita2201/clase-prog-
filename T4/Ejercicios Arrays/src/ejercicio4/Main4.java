package ejercicio4;

import java.util.Scanner;
import java.util.Random;


public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random azar = new Random(); // objeto necesario para generar numeros aleatorios

        // definidas las 2 listas de equipos
        String[] bombo1 = new String[5];
        String[] bombo2 = new String[5];

        // pedir equipos del bombo 1
        System.out.println("A continuación añada 5 países para el primer bombo");
        for (int i = 0; i < 5; i++) {
            System.out.println("Equipo"+(i+1)+":");
            String nombre = scanner.nextLine();
            bombo1[i]= nombre; // de esta forma lo metemos en la lista
        }

        System.out.println("A continuación añada 5 países para el segundo bombo");
        for (int i = 0; i < 5; i++) {
            System.out.println("Equipo"+(i+1)+":");
            String nombre = scanner.nextLine();
            bombo2[i]= nombre; // de esta forma lo metemos en la lista
        }

        //SORTEO
        for (int i = 0; i < 5; i++) {
            int posAleatoria1 = azar.nextInt(5);
            String temporal1 = bombo2[i];
            bombo1[i] = bombo1[posAleatoria1];
            bombo1[posAleatoria1]= temporal1;

            // mezclar bombo2
            int posAleatoria2 = azar.nextInt(5);
            String temporal2 = bombo2[i];
            bombo2[i] = bombo2[posAleatoria2];
            bombo2[posAleatoria2] = temporal2;
        }

        // MOSTRAR RESULTADOS
        System.out.println("\n-- Emparejamientos finales --");
        for (int i = 0; i < 5; i++) {
            System.out.println("Partido: "+ (i+1)+ ": " + bombo1[i]+ " vs " +bombo2[i]);
        }


        // todo en el sorteo no pueden repetirse los equipos, ni en los enfrentaminetos, bombo 1 vs bombo 2

    }

}
