package dao;

// permite ejecuciones CRUD (CreateReadUpdateDelete) sobre base de datos





import database.DBConnection;
import database.SchemDB;
import model.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {

    private Connection connection;
    private Statement statement;

    private PreparedStatement preparedStatement;
    private java.sql.ResultSet resultSet;



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

    public boolean insertarUsuarioPS(Clientes clientes) throws SQLException {

        String query = String.format("INSERT INTO %s (%s, %s, %s, %s, %s) VALUES (?,?,?,?,?)",
                SchemDB.TAB_CLIENTES,
                SchemDB.COL_NAME, SchemDB.COL_SURNAME, SchemDB.COL_MAIL, SchemDB.COL_PRICE, SchemDB.COL_PROFILE);

        // 3. crear statement

            preparedStatement = connection.prepareStatement(query);
            //4. parametrizar datos
            preparedStatement.setString(1, clientes.getNombre());
            preparedStatement.setString(2, clientes.getApellido());
            preparedStatement.setString(3, clientes.getCorreo());
            preparedStatement.setInt(4, clientes.getSaldo());
            preparedStatement.setInt(5, clientes.getIdPerfil());

            // 5. ejecuta
            return preparedStatement.execute();

    }

    public int actualizarUsuario(String correo,  String nombre){
        String query = String.format("UPDATE %s SET %s=? WHERE %s=?",
                SchemDB.TAB_CLIENTES, SchemDB.COL_NAME, SchemDB.COL_MAIL);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, correo);
            return preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la query");
        }
        return -1;

    }


    public List<Clientes> obtenerClientes(){

        List<Clientes> clientes= new ArrayList<>();
        String query = "SELECT * FROM "+ SchemDB.TAB_CLIENTES;

        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()){
                String nombre = resultSet.getString(SchemDB.COL_NAME);
                String apellido = resultSet.getString(SchemDB.COL_SURNAME);
                String correo = resultSet.getString(SchemDB.COL_MAIL);
                int saldo = resultSet.getInt(SchemDB.COL_PRICE);
                int idPerfil = resultSet.getInt(SchemDB.COL_PROFILE);
                clientes.add(new Clientes(nombre, apellido, correo, saldo, idPerfil));
            }
        } catch (SQLException e) {
            System.out.println("Error en la sentecnia SQL");
            System.out.println(e.getMessage());
        }
        return clientes;

    }






}
