package model;


public class Asignatura {
    // atributos
    private int id;
    private double calificacion;

    // constructor por defecto -> queda enmascarado cuando escribo explicitamente un constructor
    public Asignatura(int id){
        this.id=id;

    }
    public Asignatura(){

    }

    public void mostrarDatos(){
        System.out.println("");
        System.out.println("id = "+id);
        System.out.println("");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
