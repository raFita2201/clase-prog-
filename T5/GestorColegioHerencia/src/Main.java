import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Persona rafa = new Persona("Rafa", "Sotolongo"); no lo he podido hacer por ser la clase abstracta
        Persona alumno2 = new Alumno("Maria", "Lopez", 12345); // POLIMORFISMO: estoy creando una persona pero la visto como alumno
        Alumno alumno1 = new Alumno("Borja", "Martín", 1234);
        // Profesor profesor1 = new Profesor();
        //ArrayList<Persona> Lista = new ArrayList();
        // foreach -> Persona -> p.mostrarDatos()
        ((Alumno)alumno2).realizarExamen();
        //alumno2.realizarExamen();
        alumno2.mostrarDatos();

        Alumno alumno3 = new Alumno("Marco", "Lopez", 1234);
        alumno3.realizarExamen();
        alumno3.mostrarDatos();



        Persona interino1 = new Interino("Julio", "Iglesias", 123, 3, 4);
        Interino interino2 = new Interino("maria","gonzales", 20000, 1, 2);
        interino1.saludar();

        //Fijo fijo1 = new Fijo("Celia");
        Fijo fijo2 = new Fijo("Julia", "Martin", 20000, 10, 6);
        fijo2.mostrarDatos();
        fijo2.pedirAumento(1000);
        fijo2.mostrarDatos();
        fijo2.realizarInspeccion();


        Director director1 = new Director("Seymour", "Skinner");
        director1.mostrarDatos();
        director1.saludar();
        director1.realizarInspeccion();

        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(alumno1);
        //listaPersonas.add(alumno3);
        //listaPersonas.add(alumno2);
        listaPersonas.add(fijo2);
        listaPersonas.add(director1);

        for (Persona persona: listaPersonas){
            // presona.saludar();
            // presona.mostrarDatos();
            if (persona instanceof Inspector){
                //((Inspector)(persona).realizarInspeccion;
            }
        }

        /*for (Persona: persona : listaPersonas){
            persona.saludar();
            persona.mostrarDatos();
            if (persona instanceof Alumno){
                // solo lo podría llamar un profesor
            } else if (persona instanceof Profesor) {
            // solo lo podría llamar un profesor

            }
            persona.realizarExamen();
            persona.corregirExamen();
        }

        Profesor profesor1 = new Profesor("a", "x", 30000, 14);
        Profesor profesor2 = new Profesor("a", "x", 30000, 14);
        Profesor profesor3 = new Profesor("a", "x", 30000, 14);*/

    }
}
