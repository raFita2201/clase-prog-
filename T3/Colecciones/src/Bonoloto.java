public class Bonoloto {

    /*
    Realizar el juego de la bonoloto
    2 cadenas de numeross
        - num sistema
        - num usuario
    de primeras sistema guardara 5 numeros aleatorios 1-20
    una vez generado
    el sistema pedira al usuario que introduzca sus numeros

    el sistema debera decidir si he ganado un premio. Para ello los premios se reparten de la siguiente
    forma:
    5 aciertos-> gana 1M
    4 aciertps -> gana 10mil
    3 aciertos -> mil
    1-2 -> 10 euros
    0 -> prueba suerte la siguiente vez

    numero sistema -> 9, 12, 3, 5, 11
    numero del usuario -> 12, 9, 6, 10, 3
     */
    private int[] numerosSitema= new int[5];
    private int[] numerosUsuario = new int[5];
    public void generarNumerosSistema(){
        for (int i = 0; i < numerosSitema.length; i++) {
            numerosSitema[i] = (int) (Math.random()*20)+1;
        }
    }
    public void pedirNumeroUsuario(){
        for (int i = 0; i < numerosUsuario.length; i++) {

            int numero;
            do {
                System.out.println("Introduce un valor");
                numero= scanner.nextInt();

            }while (numero<1);
        }
    }
}
