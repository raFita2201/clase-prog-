import controller.Operaciones;


public class Main {

    public static void main(String[] args) {

        //File fichero = new File("src/main/java/resource/analisis_secundario.txt");
        // lógico o fí sico?
        /*System.out.println("Informacion del fichero");
        if(fichero.exists()){
            System.out.println("Ruta absoluta es: "+fichero.getAbsolutePath());
            System.out.println("Puede escribir: "+fichero.canWrite());
            System.out.println("Tamaño: "+fichero.length());
            System.out.println("Es una carpeta "+fichero.isDirectory());
            System.out.println("Es un fichero "+fichero.isFile());
        }else {
            try {
                fichero.createNewFile();
                System.out.println("Fichero creado correctamente");
            } catch (IOException e) {
                System.out.println("Error en la creacion del fichero");
                System.out.println(e.getMessage());
                // solucion -> indica otra ruta para crear el fichero
                // pongase en contacto con el admin
            }
        }*/
        /*File carpeta = new File("src/main/java/resources/carpeta1");

        if (carpeta.isDirectory()) {
            /*for (String item : carpeta.list()) {
                System.out.println(item);
            } */
        /*for (File item: carpeta.listFiles()) {
                System.out.println(item.getName());
                System.out.println(item.isDirectory());
                // sacar los ficheros de una subcarpeta
                if(item.isDirectory()){
                    for (File data: item.listFiles()) {
                        System.out.println("\t"+data.getName());
                        if(data.isDirectory()){
                            for (File data1: data.listFiles()) {
                                System.out.println("\t\t"+data1.getName());
                            }
                        }
                    }
                }
            }
        }*/

        // carpeta.createNewFile();


        Operaciones operaciones = new Operaciones();
        //operaciones.leerFichero("src/main/java/resources");
        //operaciones.leerContenidoFichero("src/main/java/resources/análisis.txt");
        //operaciones.leerContenidoFicheroLineas("src/main/java/resources/análisis.txt");
        //operaciones.descifrarContenidoFichero("src/main/java/resources/escritura.txt");
        //operaciones.escrituraFichero("src/main/java/resources/escritura.txt");
        //operaciones.escrituraSalto("src/main/java/resources/carpeta1/escritura_salto.txt");
        operaciones.escribirObjetos("src/main/java/resources/objetos.dat");



    }



}