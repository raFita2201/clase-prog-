package model;

// TODA CLASE DE JAVA ENTIENDE OBJECT
public class Coche {
    // una clase ees el MOLDE para crear nuestro tipo de dato
    // tengo la funcionalidad q me ha dado la clase Object

    // todas las propiedades que tenemos dentro de una clase son privadas.
    // ENCAPSULAMIENTO: cada tipo de dato maneja sus propiedades, no quiero que todoo el mundo pueda acceder a esto.
    private String marca, modelo, color;

    private int numeroPuertas, cv, precio;

    // tipo_acceso tipo_retorno nombre_metodo (argumentos){cuerpo metodo}
    // tipo_acceso nombre_metodo
    // CONSTRUCTORES -> mínimo tengo uno, el vacío está por defecto (implícito) sólo si no hay uno ya escrito
    // dos formas de crear un coche:

    public Coche(){} // no ha inicializado nada, es una especie de plantilla.

    public Coche(String marca, String modelo, int cv, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
        // La palabra reservada THIS hace referencia a la clase entera. Por eso this hace referencia al ámbito de arriba.
    }


    public Coche(String marca, String modelo, int cv, int precio, int numeroPuertas){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    // si la variable es boolean se llamará isUsado o algo así
    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        // le aplico lógica al proceso
        if (precio > 10000){
        this.precio = precio;
        }else
            System.out.printf("Error en el cambio de precio. ");
    }

}
