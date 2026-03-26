package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // es como si estuviese escrito el constructor vacío, este decorador dice que está.

public class Asignatura {
    // atributos privados: son lo primero que me encuentro cuando modelo una clase
    private int id;
    private double calificacion;

    // constructor por defecto -> queda enmascarado cuando escribo explícitamente un constructor
    // los constructores son siempre públicos
    public Asignatura(int id){
        this.id=id;

    }




    public void mostrarDatos(){
        System.out.println("Mostrando los datos de la asignatura requerida ");
        System.out.println("id = " + id);
        System.out.println("calificación" + calificacion);
    }




}
