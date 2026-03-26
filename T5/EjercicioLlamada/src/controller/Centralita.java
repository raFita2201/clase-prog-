package controller;

import model.Llamada;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private double caja;

    public Centralita(){
        listaLlamadas = new ArrayList<>(); // lo inicializo
        // caja = 0.0
    }

    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        caja += llamada.getCoste();
    }
    public void mostrarDatosLlamadas(){
        System.out.printf("Hay un total de %d llamadas%n", listaLlamadas.size());
        if (!listaLlamadas.isEmpty()){
            for (Llamada llamada: listaLlamadas){
                llamada.mostrarDatos();
            }
        }
    }
    public void mostrarCaja(){
        System.out.println("Los beneficios del día de hoy son: "+caja);
    }
}
