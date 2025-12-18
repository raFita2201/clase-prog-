package model;



public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;

    }
    public Alumno(int id1, int id2, int id3){
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }

    public void mostrarDats(){
        System.out.println("Imprimiendo los datos del alumno ");
        asignatura1.mostrarDatos();
        asignatura2.mostrarDatos();
        asignatura3.mostrarDatos();
    }
}
