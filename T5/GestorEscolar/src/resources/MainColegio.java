package resources;

import controller.Colegio;
import model.Alumno;
import model.Profesor;

public class MainColegio {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        Colegio colegio = new Colegio();
        // alumnos = [], profesor = profesor
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
       colegio.calificarAlumnos();
       colegio.mostrarResultados();


    }


}
