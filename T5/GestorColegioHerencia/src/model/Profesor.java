package model;

public abstract class Profesor extends Persona {

    private String nombre, apellido;

    private int salario;
    private int nHoras;

    public Profesor(){}

    public Profesor(String nombre, String apellido, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    public Profesor(String nombre, String apellido, int salario, int nHoras){
        this.nHoras = nHoras;
        this.salario = salario;
    }

    @Override
    public void saludar() {
        System.out.println("Soy el profesor y vamos a impartit clase ");
    }

    public void corregirExamen(){
        System.out.println("Empezando la tarea");
        System.out.println("Vamos a corregir el examen ");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario "+ salario);
        System.out.println("nHoras "+ nHoras);
    }

    // si eres abstracto, arrastras el metodo a la siguiente

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }
}

