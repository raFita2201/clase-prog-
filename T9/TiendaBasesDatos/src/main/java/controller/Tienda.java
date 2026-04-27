package controller;

import dao.ClienteDAO;

import model.Clientes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private ClienteDAO clienteDAO;

    public Tienda(){
        clienteDAO = new ClienteDAO();
    }
    public void agregarUsuario(Clientes clientes){
        System.out.println("Procedemos a agragar al usuario en el sistema");
        try {
            clienteDAO.insertarUsuarioPS(clientes);
        } catch (SQLException e) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Este correo ya está en uso, por favor indica uno diferente");
            String correo = scanner.next();
            clientes.setCorreo(correo);
            agregarUsuario(clientes);
        }

    }

    public void acualizarUsuario(String correo, String nombre){
        System.out.println("Actualizando usuario");
        int row = clienteDAO.actualizarUsuario(correo, nombre);
        if (row == 0){
            System.out.println("El correo indicado no se encuantra en la base de datos");
        }else {
            System.out.printf("El número de elementos actualizados es de "+row);
        }
    }

    public void obtenerUsuarios(){
        clienteDAO.obtenerClientes();
    }

    public void lanzarFidelización(){
        // a todos los clientes de mi base de datos le manda un correo personalizado
        List<Clientes> listado = clienteDAO.obtenerClientes();
        listado.stream().filter(data ->data.getSaldo()<50).forEach(data->
                // javamail
                System.out.println("Correo enviado a "+data.getCorreo()));
    }
}
