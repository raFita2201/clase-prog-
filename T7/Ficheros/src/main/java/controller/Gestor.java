package controller;

import model.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gestor {

    private List<Usuario> lista;
    private Operaciones operaciones;


    public Gestor() {
        lista = new ArrayList<>();
        operaciones = new Operaciones();//se juntan dos controladores
    }

    public void addUsuario(Usuario usuario) {
        this.lista.add(usuario);
        System.out.println("Usuario creado con éxito");
    }

    public void listarUsuarios() {
        this.lista.forEach(Usuario::mostrarDatos);
    }


    public void exportar() {
        //lista.stream().forEach(System.out::println);
        lista.forEach(user -> {
            try {
                operaciones.exportarUsuario(user);
            } catch (IOException e) {
                System.out.println("Error por fallos en los permisos");
                System.out.println(e.getMessage());
            }
        });

    }

    public void importar() {
        lista = operaciones.importarUsuario();
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }


}
