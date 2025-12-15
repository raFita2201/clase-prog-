import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero =2;
        //defino el array segun el numero de elementos
        //int[] numeros =new int[6];
        // [0,0,0,0,0,0]
        //   0 1 2 3 4 5 -> posiciones, siempre empizan el 0 como la primera posición
        boolean[] aciertos = new boolean[4];
        // [false, false, false, false]
        // **guarda el dato mas basico del tipo correspondiente**, valor primitivo del complejo es no hay valor, nulo
        String[] palabras = new String[3];
        // [null, null, null]
        Object[] cosas = new Object[5];
        // [1, false, "hola", 9.1, 'a'] pero de base guardara valores nulos.
        int[] numerosConcretos = new int[]{5,3,1,10,8};
        //  [5,3,1,10,8]
        //   0 1 2 3 4 5 -> posiciones
        //Integer[] numerosConcretos2 = new Integer[]{1,3,4,5,6,7,8};
        boolean[] aciertosConcretos = new boolean[]{false, true, false};
        String[] palabrasConcretas = new String[]{"hola", "programacion", "array"};
        Object[] cosasConcretas = new Object[]{1,"hola" , false, 0.0, 'a'};
        for (Object item: cosasConcretas){
            if (item instanceof Integer){
                if ((int)item>0){
                    System.out.println("el numero es mas grande que 0");
            }
        }

        /*


        // acciones que puedo realizar con los arrays
        int[] numeros =new int[6];
        // [19,0,0,0,30]
        //  0 1 2 3 4 5
        // saber la longitud del array-> cuantos elementos hay en el array
        int longi = numerosConcretos.length;
        System.out.println("el numero de elementos del array es "+longi);
        // modificar valores,
        numeros[0]=19;
        numeros[5]=30;
        // acceder a uno de los elementos, primero y ultimo aquí:
        System.out.println("el elemento de la primera posicion es "+numeros[0]);
        System.out.println("el elemento de la posicion central es "+numeros[numeros.length/2]);
        System.out.println("el elemento de la última posicion es "+numeros[numeros.length-1]);
        // mostrar todos los elementos del array
        System.out.println("el elemento de la primera posicion es "+numeros[0]);
        System.out.println("el elemento de la primera posicion es "+numeros[1]);
        System.out.println("el elemento de la primera posicion es "+numeros[2]);
        System.out.println("el elemento de la primera posicion es "+numeros[3]);
        System.out.println("el elemento de la primera posicion es "+numeros[4]);
        System.out.println("el elemento de la primera posicion es "+numeros[5]);



        // Utilizado para poder recorrer un array desde una posicion inicial hasta una final
        //Utilizado para modificar el valor de las posiciones
         for (int i=0;i<numeros.length;i++){
           // if (numeros[i]%2!=0){
                System.out.printf("el elemento en posicion %d es %d%n", i, numeros[i]);
            //}
        }*/
        /*
        for (int i = 2; i <numeros.length ; i++) {
            //if (numeros[i]%2!=0{
        System.out.println();
        } */
        // [19,0,0,0,30]
        /*int contador =0;
        for ( int item: numeros){
            System.out.println("el elemento en iteracion es"+contador );
            contador++;

        }
        */
        /* acciones qu
        Scanner scanner= new Scanner(System.in);
        System.out.println("cuantos numeros vas a queres guardar");
        int tamanio = scanner.nextInt();
        int[] numeros = new int[tamanio];


        for (int i=0; i< numeros.length;i++){
            numeros[i] = (int) (Math.random()+50)+1; //0-49
        }
        System.out.println("que numero queires buscar");
        int numeroBuscar = scanner.nextInt();
        int contador=0;


        for (int item:numeros){
            if (item== numeroBuscar){
                contador++;



        /*for (int item: numeros){
            System.out.println(item);

        }*/

        //}
          //  System.out.println(item);*/
        //pedir al usuario el numero buscado
        // el sistema debera decirme donde esta el primer 23 encontrad. En caso de no tener 23 me avisa
        /*System.out.println("cuantos numeros vas a queres guardar");
        int numeroBuscar = scanner.nextInt();//23
        int contador=0;
        boolean encontrado=true;
        break;
        for (int i = 0; i < numeros.length; i++) {

        }
         */











        }
}
