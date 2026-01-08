package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor // decorador que nos dice que existe el constructor vacío.

public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    // otra forma de construir un alumno.
    public Alumno(int id1, int id2, int id3){
        this.asignatura1 = new Asignatura(1);
        this.asignatura2 = new Asignatura(2);
        this.asignatura3 = new Asignatura(3);
    }

    public void mostrarDatos(){
        System.out.println("Imprimiendo los datos del alumno ");
        asignatura1.mostrarDatos();
        asignatura2.mostrarDatos();
        asignatura3.mostrarDatos();
    }
}
