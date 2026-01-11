package model;

public class Profesor extends Persona {

    private String dni, correo;

    public Profesor(String dni, String correo){
        this.dni = dni;
        this.correo = correo;
    }

    @Override
    public void saludar() {
        System.out.println("Yo como saludar lo hago de esta otr forma ");
    }

    public void impartirClase(){
        
    }
}
