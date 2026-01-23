package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public abstract class Llamada {
    private long nOrigen, nDestino;
    private int duracion;
    private double costeSegundo;
    private double coste;

    public void mostrarDatos() {
        System.out.println("nOrigen = " + nOrigen);
        System.out.println("nDestino = " + nDestino);
        System.out.println("duracion = " + duracion);
        System.out.println("costeSegundo = " + costeSegundo);
        System.out.println("coste = " + coste);
    }

    public abstract void calcularCoste();

    // TODO cuidado con el coste, automatizar el calculo

    public Llamada(long nOrigen, long nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
    }
}
