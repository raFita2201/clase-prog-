package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Profesor {
    public Profesor() {
    }
    // no tengo atributos -> el constructor default está implícito.

    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion(Math.random()*10+0.1); // *10+0.1 para que genere mínimo un 0.1 y máx un 10.
        alumno.getAsignatura2().setCalificacion(Math.random()*10+0.1);
        alumno.getAsignatura3().setCalificacion(Math.random()*10+0.1);
    }
    public double calcularMedia(Alumno alumno){
        double media = alumno.getAsignatura1().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getCalificacion();

        return (media)/3;
    }

}
