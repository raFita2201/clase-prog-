package model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private final static Long serialVersionUID= 1L;

    private String nombre, apellido, dni;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        // Rafa, Sotolongo, 1234
        return String.format("%s,%s,%s", nombre, apellido, dni); //me quito el super y le digo yo como se representa el objeto, en este caso: nombre, apellido, dni.
        // le quito el salto de linea (\n) para utilizar le printWrtitter ahora.
    }
}
