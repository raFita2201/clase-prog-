package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

    public void leerFichero(String path) {
        File file = new File(path);
        System.out.println(file.getName());
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                leerFichero(item.getAbsolutePath());
            }
        }
    }

    public void leerContenidoFichero(String path) {
        //File _> FileReader
        File file = new File(path);
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo;
            while ((codigo = fileReader.read()) != -1) {
                // mientras la lectura sea != -1 -> muestra
                // System.out.print(codigo);
                // System.out.print(" - ");
                System.out.print((char) codigo);// casteo de entero a letra int -> char
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existe");
            //prueba con otra ruta
            //leerContenidoFichero();
        } catch (IOException e) {
            System.out.println("No cuentas con los permisos suficientes");
            System.out.println("Ponte en contacto con tu administrador ");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void leerContenidoFicheroLineas(String path) {
        File file = new File(path);
        FileReader fileReader = null;//no sería necesario inicializar este, basta con el de abajo (bufferedReader)
        BufferedReader bufferedReader = null;

        try {
            // fileReader = ;
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // linea = bufferedReader.readLine(); -> ERROR muy típico
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("La ruta es incorrecta");
        } catch (IOException e) {
            System.out.println("No cuentas con los permisos suficientes");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }

    public void descifrarContenidoFichero(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        Scanner scanner = new Scanner(System.in);

        try {
            reader = new BufferedReader(new FileReader(file));
            System.out.println("Dime cual es la clave de cifrado");
            int clave = scanner.nextInt();
            String linea = reader.readLine();
            String[] numeros = linea.split(" ");
            for (String item : numeros) {
                int codigo = Integer.parseInt(item);
                System.out.print((char) (codigo / clave));
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no es valido");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero, sin permisos");
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void escrituraFichero(String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        Scanner scanner = new Scanner(System.in);

        try {
            fileWriter = new FileWriter(file, true);
            System.out.println("Dime como quieres cifrar el mensaje");
            int clave = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("dime que quieres que guarde en el fichero");
            String mensaje = scanner.nextLine();
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                int codigo = (int) letra;
                fileWriter.write(String.valueOf(codigo * clave)); // le doy un número ejemplo: 24, y lo cambia a String 24.
                fileWriter.write(" ");
            }
        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }


    }

    public void escrituraSalto(String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        //BufferedWriter bufferedWriter = null; -> prácticamente el mismo uso, PrintWritter mas nuevo, mejor gestión de memoria

        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.println("1 Me imprime la linea dentro del fichero y luego salto de línea");
            printWriter.println("2 Me imprime la linea dentro del fichero y luego salto de línea");
            printWriter.println("3 Me imprime la linea dentro del fichero y luego salto de línea");
            printWriter.println("4 Me imprime la linea dentro del fichero y luego salto de línea");

        } catch (IOException e) {
            System.out.println("Fallo en el proceso de escritura");
        } finally {
            try {
                assert printWriter != null;
                printWriter.close();
            } catch (Exception e) {
                System.out.printf("Fallo en el proceso de cerrado con error %s", e.getMessage());
            }
        }

    }

    public void exportarUsuario(Usuario usuario) throws IOException {
        // me das un usuario y lo escribo en la ruta de exportación.
        File file = new File("src/main/java/resources/usuarios.csv");
        PrintWriter printWriter = null;
        //el fichero no está -> lo creas u escribes una línea

        //el fichero si esta --> escribe el usuario
        try {
            file.createNewFile();
            if (!file.exists()) {
                printWriter = new PrintWriter(new FileWriter(file));
                printWriter.println("nombre, apellido, dni");
                // escribe el usuario //TODO el primero si no existe???
                exportarUsuario(usuario);
            } else {
                printWriter = new PrintWriter(new FileWriter(file, true));
                printWriter.println(usuario);
            }
        } catch (IOException e) {
            System.out.println("Error en la creación del fichero");
        } finally {
            try {
                printWriter.close();

            } catch (Exception e) {
                System.out.println("Fallo en el cerrado");
                System.out.println(e.getMessage());
            }
        }


    }

    public List<Usuario> importarUsuario() {
        File file = new File("src/main/java/resources/usuarios.csv");
        BufferedReader reader = null;
        List<Usuario> lista = new ArrayList<>();

        try {

            reader = new BufferedReader(new FileReader(file));
            String linea = reader.readLine();
            while ((linea = reader.readLine()) != null) {
                String[] items = linea.split(","); //quiero pasarla a -> split -> usuario
                Usuario usuario = new Usuario(items[0],items[1],items[2]);
                lista.add(usuario);
            }
        } catch ( FileNotFoundException e) {
            System.out.println("Ruta incorrecta, item no encontrado");
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public void escribirObjetos(String path){
        File file = new File(path);
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            //objectOutputStream.writeInt(76);
            objectOutputStream.writeObject(new Usuario("Borja", "Martin", "123123"));
        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero");
            System.out.println(e.getMessage());
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerraado");
                System.out.println(e.getMessage());
            }

        }

    }
}
