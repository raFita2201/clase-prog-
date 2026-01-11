import model.Alumno;
import model.Persona;

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
    }
}
