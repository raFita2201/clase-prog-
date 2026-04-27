import controller.Tienda;
import dao.ClienteDAO;
import database.DBConnection;
import model.Clientes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*

        ClienteDAO clienteDAO = new ClienteDAO();
        // si lo pido por teclado es lo mismo
        try {
            boolean rows = clienteDAO.insertarUsuarioPS(new Clientes("Luis", "Alonso", "luis@gmail.com",1244, 6));
        } catch (SQLException e) {
            System.out.println("Error en la sentencia SQL");
            System.out.println(e.getMessage());
        }
         */

        /*
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();
        System.out.println("Indica nombre");
        String nombre = scanner.next();
        System.out.println("Indica correo");
        String correo = scanner.next();
        tienda.acualizarUsuario(correo, nombre);

         */

        Tienda tienda = new Tienda();
        tienda.lanzarFidelización();



        /*
        System.out.println("Indica apellido");
        String apellido = scanner.next();
        System.out.println("Indica saldo");
        int saldo = scanner.nextInt();
        System.out.println("Indica id Perfil");
        int idPerfil = scanner.nextInt();

        tienda.agregarUsuario(new Clientes(nombre, apellido, correo, saldo, idPerfil));

         */

        // menú

    }
}
