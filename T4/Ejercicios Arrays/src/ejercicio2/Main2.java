package ejercicio2;

import java.util.Scanner;

/*
2. Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
seleccione la acción que quiere realizar:
a. Imprimir array
b. Mover a izquierda
c. Mover a derecha
d. Invertir
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        // [ 0 0 0 0 0 0 0 0 0 0 ]
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int) (Math.random()*20+1);
        }
        // si el numero mas pequeño que genera es el cero: 0-19 (comprende 20 numeros)// , si le sumo 1 me queda como que el numero mas pequeño que genera es el 1, rango 1-20
        // para IMPRIMIR EL ARRAY uso un foreach (iter)
        for (int item : numeros) {
            System.out.print(item+" ");
        }
        System.out.println();
        // 20 3 14 15 11 1 12 13 2 13
        System.out.println("Indica que acción quieres realizar");
        System.out.println("1. imprimir array");
        System.out.println("2. mover izquierda");
        System.out.println("3. mover derecha");
        System.out.println("4. invertir");
        int opcion;
        do {
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    for (int item : numeros) {
                        System.out.print(item+" ");
                    }
                    System.out.println();
                }
                // mover a la izquierda
                case 2->{
                    int temporal = numeros[0];
                    for (int i = 0; i < numeros.length-1; i++) {
                        // int temp = numeros[i];
                        numeros [i] = numeros[i+1];
                    }
                    numeros[numeros.length-1] = temporal;
                }
                // mover a la derecha
                case 3->{
                    int temporal = numeros[numeros.length-1];
                    for (int i = numeros.length-1; i > 0 ; i--) {
                        numeros[i] = numeros[i-1];
                    }
                    numeros[0] = temporal;
                }
                // INVERTIR ARRAY, leo hasta la mitad y voy rotando, si es impar hay un numero q se queda inmóvil, sería como un eje de rotación.
                case 4->{
                    for (int i = 0; i < numeros.length/2; i++) {
                        int temporal = numeros[i];
                        numeros[i] = numeros[numeros.length-1-i];
                        numeros[numeros.length-1-i] = temporal;
                    }
                }
            }
        }while (opcion!=5);


        // todo min: 1:29:




    }


}

