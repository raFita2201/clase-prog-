import controller.Centralita;
import model.Llamada;
import model.Local;
import model.Nacionales;
import model.Provincial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Llamada llamada = new Llamada(1111, 2222, 10);
        llamada.mostrarDatos();
        Local llamadaLocal = new Local(111, 222, 10);
        //llamadaLocal.mostrarDatos();

        Provincial llamadaProvincial = new Provincial(333, 444, 10);
        llamadaProvincial.mostrarDatos();

        Nacionales llamadaNacional = new Nacionales(222, 333, 10, 3);
        llamadaNacional.mostrarDatos(); */
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Centralita centralita = new Centralita();
        do {
            System.out.println("1. Registrar llamada");
            System.out.println("2. Mostrar llamadas");
            System.out.println("3. Mostrar caja");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("Indica que llamada quieres registrar");
                    System.out.println("1-Local");
                    System.out.println("2-Provincial");
                    System.out.println("3-Nacional");
                    int tipo = scanner.nextInt();
                    Llamada llamada = null;
                    System.out.println("Indica el origen");
                    long nOrigen = scanner.nextLong();
                    System.out.println("Indica el destino");
                    long nDestino = scanner.nextLong();
                    System.out.println("Indica la duración");
                    int duracion = scanner.nextInt();
                    switch (tipo){
                        case 1 -> {
                            llamada = new Local(nOrigen, nDestino, duracion);
                        }
                        case 2-> {
                            llamada= new Provincial(nOrigen, nDestino, duracion);
                        }
                        case 3 -> {
                            System.out.println("Indica la franja");
                            int franja = scanner.nextInt();
                            llamada = new Nacionales(nOrigen, nDestino, duracion, franja);
                        }
                    }
                    centralita.registrarLlamada(llamada);
                }
                case 2->{
                    centralita.mostrarDatosLlamadas();
                }
                case 3 -> {
                    centralita.mostrarCaja();
                }
                case 4 -> {
                    System.out.println("Saliendo");
                }
                default -> {
                    System.out.println("Operación inválida");
                }
            }

        }while (opcion !=4);
    }
}
