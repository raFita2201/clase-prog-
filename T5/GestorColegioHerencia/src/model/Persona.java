package model;

public abstract class Persona { // una clase abstracta no se puede utilizar.
    private String nombre, apellido;


    // constructor: PÚBLICOS, (lo que va en el paréntesis es una referencia)
    // solo 1 constructor, el implícito queda enmascarado.
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // vacío
    public Persona(){}

    public abstract void saludar(); // no tiene ninguna funcionalidad común. Quiero que tengan el metodo pero ellos deciden cómo saludar.
    // si no le voy a poner funcionalidad debo marcarlo como ABSTRACT.



    public void mostrarDatos(){
        System.out.println("nombre = " + nombre); //soutv
        System.out.println("apellido = " + apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
