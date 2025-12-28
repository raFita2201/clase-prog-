package ejercicio4;

import java.util.Collections;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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




    }
}
