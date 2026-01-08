import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Main {

    /*
    Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

- Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
- Alumno: tres Asignatura; constructores con 3 Asignatura o con 3 ids.
- Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
- Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.
     */
    
    public static void main(String[] args) {
        //UML - diagrama de clases
        // id= 0 calificacion =0.0
        Asignatura programacion = new Asignatura(1);
        //id=1 calificaciones=0.0
        Asignatura sistemas = new Asignatura(2);
        //id=2 calificaciones=0.0
        Asignatura entornos = new Asignatura(3);
        //id=3 calificaciones=0.0
        Asignatura basesDeDatos = new Asignatura();

        Asignatura fundamentos = new Asignatura();

        Alumno borja = new Alumno(programacion, sistemas, entornos);
        // asi1 = programacion(1,0.0) - asi2 = sistemas(2,0.0) - asi3 = entornos(3,0.0)
        //borja.getAsignatura1().getCalications;
        Alumno maria = new Alumno(programacion, sistemas, entornos);
        Alumno marcos = new Alumno(programacion, sistemas, entornos);
        Alumno celia = new Alumno(1,2,3);
        // asi1=Asignatura(1,0.0)   asi2  asi3  -> es nuevo.

        System.out.println("Comprobamos cuáles son las notas de los alumnos ");
        Profesor profesor = new Profesor();
        System.out.println("Procedemos a mostrar las notas ");
        profesor.ponerNotas(marcos);
        profesor.ponerNotas(celia);

        System.out.println("la calificación de programación es "+programacion.getId());
        System.out.println("La media de celia es "+profesor.calcularMedia(celia));
        System.out.println("La media de marcos es "+profesor.calcularMedia(marcos));
        System.out.println("La media de maría es "+profesor.calcularMedia(maria));


    }
}
