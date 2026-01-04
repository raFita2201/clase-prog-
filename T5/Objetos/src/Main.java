import model.Coche;
import model.Comprador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 5;
        // variable primitiva pq no tiene funcionalidades extra, simplemente sirve para almacenar datos.
        String nombre = "Rafa";
        // toda clasw, por ser clase java tiene las funcionalidades de object, OBJECT ES LA CLASE PRINCIPAL DE JAVA. (ser humano)
        nombre.length(); // 5
        // compleja, pq tiene funcionalidades, además del dato nombre.()
        String apellido = "Sotolongo";
        apellido.length();// misma funcionalidad pero cada una accede a la variable correspondiente
        Scanner scanner = new Scanner(System.in); // lo puedo usar pq es un elemento definido en java.
        int[] numeros = new int[8];
        ArrayList<Integer> lista = new ArrayList<>();
        // TIPO DATO nombreVariable = VALOR;
        Coche ford = new Coche("ford", "focus", 150, 30000);
        // marca=Ford, modelo=Focus, color=null, numeroPuertas=0, cv=150, precio=30000

        // todas las variales complejas, para su creación se utiliza la palabra reservada NEW. Con el new lo hago real.
        Coche mercedes = new Coche("mercedes", "ClaseC", 300, 70000);
        //Coche mercedes = new Coche("Mercedes", "ClaseC", 300, 70000);
        // marca=Mercedes, modelo=ClaseC, color=null, numeroPuertas=0, cv=300, precio=70000
        Coche audi = new Coche();
        //
        Coche mondeo = new Coche("Ford", "Focus", 150, 40000, 5);
        // marca=Mondeo, modelo=Ford color=Focus, cv=150, precio=40000, numeroPuertas=5
        // obtener el precio del coche

        Comprador comprador = new Comprador("Rafa", "Sotolongo", "Zaragoza");
        System.out.println("La dirección de envío del coche será "+comprador.getDireccion());
        mondeo.setPrecio(1000);
        System.out.println("El precio del mondeo es "+mondeo.getPrecio());
        // si quiero obtenerlo se lo pregunto desde el metodo getter. 6 características = 6 metodos getter/setter
        // getter: obtienen el valor de un ...
        // setter: modifican el valor de un atributo, pudiendo llamar desde otros sitios

    }
}
