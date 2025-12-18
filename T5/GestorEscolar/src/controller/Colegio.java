package controller;

import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

public class Colegio {

    private ArrayList<Alumno> alumnos;
    private Profesor profesor;

    public Colegio(){
        alumnos = new ArrayList<>();
        }

    public Colegio(Profesor profesor){
        this.profesor = profesor; // lo construyo de la forma que yo necesite.
    }

    public void matricularAlumno(Alumno alumno){
        this.alumno.add(alumno);
        System.out.println("Matriculado correctamente");
    }

    public void calificarAlumnos(){
        // paso el parametro cuano lo voy a usar y no lo tengo dentro de la clase
        System.out.println("procedemos a calificar");
        for (Alumno alumno: alumnos){
            profesor.ponerNotas(alumno);
        }
    }

    public void mostrarResultados(){
        System.out.println("Vamos a ver la media de los alumnos");
        double mediatotal;
        for (Alumno alumno: alumnos){
            double mediaAlumno = profesor.calcularMedia();
            System.out.println("la media del alumnos es "+);
        }
        System.out.println("La nota media total de los alumnos es de "+mediatotal/ alumnos.size());
    }

}
