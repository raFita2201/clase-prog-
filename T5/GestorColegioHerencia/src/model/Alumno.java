package model;

public final class Alumno extends Persona{

    private int numeroMatricula, cursoMatriculado;
    // getter / setter
    // mostrarDatos
    // saludar

    public Alumno(String nombre, String apellido, int numeroMatricula){
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
    }

    public Alumno(String nombre, String apellido, int numeroMatricula, int cursoMatriculado){
        super(nombre, apellido);
        this.numeroMatricula = numeroMatricula;
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override // sólo si voy a modificar su comportamiento
    public void saludar() {
        System.out.println("Soy alumno y saludo así ");
    }

    public void realizarExamen(){
        System.out.println("Voy a realizar un examen ");
        int nota = (int)(Math.random()*11);
        System.out.println("La nota del examne ha sido "+ nota);

    }

    @Override // indica que el metodo no me pertenece a mi sino que kle pertenece al de arriba y yo le voy a modificar su comportamiento.
    public void mostrarDatos() {
        super.mostrarDatos(); // supero llama al metodo de arriba. Sólo puede ir el la primera.
        System.out.println("numero de matrícula ="+ numeroMatricula);
        System.out.println("cursos matriculados = "+ cursoMatriculado);
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(int cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
}
