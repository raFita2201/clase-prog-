package dao;

// permite ejecuciones CRUD (CreateReadUpdateDelete) sobre base de datos

import com.mysql.cj.protocol.Resultset;
import database.DBConnection;
import database.SchemDB;
import model.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {

    private Connection connection;
    private Statement statement;

    private PreparedStatement preparedStatement;

    private Resultset resultset;

    public ClienteDAO(){
        connection = DBConnection.getConnection(); // mi conexion ya está activa para todos los métodos CRUD de este controlador.
        // La copia de la que ya esta activa para no saturar el server
    }


    // todo metodos CRUD

    public int insertarUsuario(Clientes clientes) {
        // 1 - Conection
        // 2 - Query
        // INSERT INTO clientes (nombre, apellido, correo, saldo, id_perfil) VALUES (cliente.getNombre)
        // String query = "INSERT INTO clientes (nombre, apellido, correo, saldo, id_perfil) VALUES ('"+cliente.getNombre()+"','"+cliente.getApellido()+"'"+cliente.getSaldo()+")";
        String query = String.format("INSERT INTO %s (%s, %s, %s, %s, %s) VALUES ('%s','%s','%s',%d,%d)",
                SchemDB.TAB_CLIENTES,
                SchemDB.COL_NAME, SchemDB.COL_SURNAME, SchemDB.COL_MAIL, SchemDB.COL_PRICE, SchemDB.COL_PROFILE,
                clientes.getNombre(), clientes.getApellido(), clientes.getCorreo(), clientes.getSaldo(), clientes.getIdPerfil()
        );
        // 3. crear statement
        try {
            statement = connection.createStatement();
            // 4. ejecuta

            return statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error en la ejecucion");
            System.out.println(e.getMessage());
        }
        return -1;
    }





}
