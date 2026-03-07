package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Gestor {

    private List<Usuario> lista;

    public Gestor(){
        lista = new ArrayList<>();
    }

    public List<Usuario> getLista(){
        return lista;
    }
    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }



}
