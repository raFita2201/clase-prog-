package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Clientes {
    // la clase debe tener el mismo nombre de la tabla en la BBDD

    private long id;
    private String nombre, apellido, correo;

    public Clientes(String nombre, String apellido, String correo, int saldo, int idPerfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.saldo = saldo;
        this.idPerfil = idPerfil;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    private int saldo;
    private int idPerfil; // el id va un poco indepe,



}
