package controller;

import lombok.Getter;
import lombok.Setter;
import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

@Setter
@Getter

public class Colegio {

    private ArrayList<Alumno> alumnos;
    private Profesor profesor;

    public Colegio(){
        alumnos = new ArrayList<>();
        }

    public Colegio(Profesor profesor){
        this.profesor = profesor; // lo construyo de la forma que yo necesite.
        this.alumnos = new ArrayList<>();
    }

    public void matricularAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        System.out.println("Matriculado correctamente");
    }

    public void calificarAlumnos(){
        // paso el parámetro cuando lo voy a usar y no lo tengo dentro de la clase. Ejemplo: si necesitase la nota minima lo pido como parámetro dentro ().
        System.out.println("Procedemos a calificar");
        for (Alumno alumno: alumnos){
            profesor.ponerNotas(alumno);
        }
    }

    public void mostrarResultados(){
        System.out.println("Vamos a ver la media de los alumnos ");
        double mediaTotal = 0;
        for (Alumno alumno: alumnos){
            double mediaAlumno = profesor.calcularMedia(alumno);
            System.out.println("la media del alumno es " + mediaAlumno);
            mediaTotal+=mediaAlumno;
        }
        System.out.println("La nota media total de los alumnos es de " +mediaTotal / alumnos.size());
    }

    /* getter y setter a mano por tenerlos para estudiar, redundante si los declaramos arriba, por eso esta comentado.
    public ArrayList<Alumno> getAlumnos(){
        return this.alumnos;
    }

    public void setAlumnos (ArrayList<Alumno> alumnos){
        this.alumno = alumnos;
    }
     */

}
