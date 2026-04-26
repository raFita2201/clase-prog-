import dao.ClienteDAO;
import database.DBConnection;
import model.Clientes;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        int rows = clienteDAO.insertarUsuario(new Clientes("Marta", "Lopez", "marcos@gmail.com",123, 3 ));
        if (rows > -1){
            System.out.println("Inserción correcta");
        }
    }
}
