package model;



public class Profesor {
    // no tengo atributos -> el contr default esta implícito

    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion(Math.random()*10+0.1);
        alumno.getAsignatura2().setCalificacion(Math.random()*10+0.1);
        alumno.getAsignatura3().setCalificacion(Math.random()*10+0.1);
    }
    public double calcularMedia(Alumno alumno){
        double meida = alumno.getAsignatura1().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getCalificacion();

        return (meida/3);
    }

}
