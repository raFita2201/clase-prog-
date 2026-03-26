package model;

// quiero que los profesores sean o interinos o fijos
public final class Interino extends Profesor{

    // saluda
    private int aniosExperiencia;

    public Interino(){}

    public Interino(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Interino(String nombre, String apellido, int salario, int nHoras, int aniosExperiencia) {
        super(nombre, apellido, salario, nHoras);
    }

    public void saludar(){
        super.saludar();;
        if (aniosExperiencia>0){
            System.out.println("poca xp");
        }else {
            System.out.println("soy novato");
        }
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("años xp "+aniosExperiencia);
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }


    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
