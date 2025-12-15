package ejercicio2;

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
        int[]numeros = new int[10];
        // se han guardado 10 posiciones de 0s
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*20+1);// 0+1 - 19+1
        }
        System.out.println("Indica las acciones que quieres hacer");
        for (int item: numeros){
            System.out.println(item+" ");
        }
    }
}
