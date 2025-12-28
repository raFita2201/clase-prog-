import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{8,12,5,45,2};
        String[] palabras = new String[]{"palabra1", "hola", "adios","juego", "programacion"};
        /*
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return -1;
                } else if (o1.length() < o2.length()) {
                    return 1;
                }
                return 0; // ha ordenado las palabras de mayor a menor pq yo le he dicho la condición de ordenación que es el COMPARATOR.
            }
        });*/ // me lo ordena.
        //numeros = Arrays.copyOf(numeros, 10); // no se suele utilizar para reasignar de forma dinámica, para esto utilizamos otra colección.
        for (int numero : numeros) {
            System.out.println(numero);
        }

        //Object[] persona = new Object[5]{"Rafa",24,"rafa@gmail.com",true,'A'};//tenemos que saber seguro que ese dato es tipo int, y lo casteo manualmente.
        // [null, null, null, null, null]
        /*
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*21);
        }
        for (int item : numeros) {
            System.out.println(item);
        }
         */


    }
}
