package ejercicio1;

import java.util.Scanner;

/* 1. Crea un programa que permita sumar arrays multidimensionales. Para ello
siguiente estos pasos:
a. Pide al usuario el tamaño de las matrices
b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
15
c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
de las celdas de las generadas en el punto anterior
d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
para poder identificarlas. */
public class Main {
    public static void main(String[] args) {
        // arrays multidimensionales => elementos que tiene mas de una dimension, filas, columnas
        /*
        int[][] matriz = new int[][]{{1,2,3}
        int[][] matriz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el tamaño de tu matriz");
        int tamano = scanner.nextInt();
        int[][] matrizA = new int[tamano][tamano];
        int[][] matrizB = new int[tamano][tamano];
        /*
        MatrizA         MatrizB
        0   0   0       0   0   0
        0   0   0       0   0   0
        0   0   0       0   0   0

         */
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matrizA[i][j] = (int) (Math.random() * 17);
                matrizB[i][j] = (int) (Math.random() * 17);


            }
        }
        System.out.println("Imprimiendo matrices");
        for (int[] fila : matrizA) {
            for (int item : fila) {
                System.out.println(item + "\t");
            }
            System.out.println();

            System.out.println("Imprimiendo matrices");
            for (int[] fila : matrizB) {
                for (int item : fila) {
                    System.out.println(item + "\t");
                }
                System.out.println();
            }

            int[][] sumaMatrices = new int[tamano][tamano];
            for (int i = 0; i < tamano; i++) {

            }
        }

    }
