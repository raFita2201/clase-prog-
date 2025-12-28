public class MainMultidimandial {
    public static void main(String[] args) {

        //int[][] matriz = new int[3][3]; // fila y columna para la matriz.
        //int[][] matriz = new int[][]{{4,8,9}, {14,16,14},{12,4,7}};
        // 3 filas
        // 3 columnas
        // 4 7 9
        // 14 17 19
        // 13 4 7
        //matriz [0] -> obtengo la fila en posición 1.
        //mariz [2][1] -> elemento f2c1
        // cuántas filas tengo
        //System.out.println("El tamaño de las filas es de "+matriz.length);
        //cuantas columnas tiene la primera fila
        /*System.out.println("El tamaño de las columnas de la primera fila es "+matriz[0].length); // pregunto por la longi del ARRAY
        System.out.println("El tamaño de las columnas de la segunda fila es "+matriz[1].length);
        System.out.println("El tamaño de las columnas de la tercera fila es "+matriz[2].length);
        //obtener un elemento en concreto
        //matriz[2][0] =6;
        System.out.println("El elemento buscado es "+matriz[2][0]);*/
        // sacar todos los elementos -> for anidado
        // RECORRER y ALTERAR los valores
        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]%2==0){
                System.out.print(matriz[i][j]+"\t");

                }

            }
            System.out.println();
        }*/
        // si solo voy a RECORRER y PREGUNTAR.
        /*for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }*/
        Sudoku sudoku = new Sudoku();
        // int [3][3]
        sudoku.empezarJuego();
    }
}
