package model;

public abstract class Profesor extends Persona {

    private String nombre, apellido;

    private int salario;
    private int nHoras;

    public Profesor(){}

    public Profesor(String nombre, String apellido, int salario, int nHoras){
        this.nHoras = nHoras;
        this.salario = salario;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    // si eres abstracto, arrastras el método a la siguiente


    @Override
    public void saludar() {
        System.out.println("Yo como saludar lo hago de esta otr forma ");
    }



    public void corregirExamen(){
        System.out.println("Empezando el examen");
    }
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

