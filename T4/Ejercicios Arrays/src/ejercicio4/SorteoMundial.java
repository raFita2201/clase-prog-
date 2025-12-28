package ejercicio4;

import java.util.Scanner;
import java.util.Random; // Necesario para el sorteo aleatorio

public class SorteoMundial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random azar = new Random(); // Objeto para generar números aleatorios

        // 1. Definimos los arrays con tamaño fijo [5]
        String[] bombo1 = new String[5];
        String[] bombo2 = new String[5];

        // 2. Pedir selecciones del bombo 1
        System.out.println("A continuación añada 5 selecciones para el primer bombo:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Equipo " + (i + 1) + ": ");
            // En arrays no se usa .add(), se usa el índice [i]
            bombo1[i] = scanner.nextLine();
        }

        // 3. Pedir equipos del bombo 2
        System.out.println("\nA continuación añada 5 países para el segundo bombo:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Equipo " + (i + 1) + ": ");
            bombo2[i] = scanner.nextLine();
        }

        // 4. SORTEO (Lógica manual para barajar los Arrays)
        // Intercambiamos posiciones al azar para "mezclar"
        for (int i = 0; i < 5; i++) {
            // Mezclar bombo 1
            int posAleatoria1 = azar.nextInt(5);
            String temporal1 = bombo1[i];
            bombo1[i] = bombo1[posAleatoria1];
            bombo1[posAleatoria1] = temporal1;

            // Mezclar bombo 2
            int posAleatoria2 = azar.nextInt(5);
            String temporal2 = bombo2[i];
            bombo2[i] = bombo2[posAleatoria2];
            bombo2[posAleatoria2] = temporal2;
        }

        // 5. Mostrar resultados
        System.out.println("\n-- Emparejamientos FINALES --");
        for (int i = 0; i < 5; i++) {
            // En arrays no se usa .get(i), se usa [i]
            System.out.println(bombo1[i] + " vs " + bombo2[i]);
        }
    }
}