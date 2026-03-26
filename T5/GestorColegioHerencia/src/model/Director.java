package model;

public class Director extends Persona implements Inspector{

    public Director(){

    }

    @Override
    public void realizarInspeccion() {
        System.out.println("Soy el jefe y vamos a inspeccionar a fondo");
    }

    public Director(String nombre, String apellido) {
        super(nombre, apellido);
    }

    // me obliga al extender de persona
    @Override
    public void saludar() {
        System.out.println("Soy el jefe, yo mando ");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
