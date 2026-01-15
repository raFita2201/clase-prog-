package model;

public final class Fijo extends Profesor implements Inspector{

    private int nHorasCotizadas;

    public Fijo (){}

    public Fijo(String nombre, String apellido, int salario, int nHoras, int nHorasCotizadas) {
        super(nombre, apellido, salario, nHoras);
        this.nHorasCotizadas = nHorasCotizadas;
    }

    @Override
    public void saludar() {
        super.saludar();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nHorasCotizadas "+nHorasCotizadas);
    }

    @Override
    public void realizarInspeccion() {
        System.out.println("Inspeccionare pero pasaré cosas por alto");
    }

    public void pedirAumento(int aumentar){
        // como le sumo salario
        this.setSalario(getSalario()+aumentar);
        System.out.println("Aumentas salario "+aumentar);
    }




    public int getnHorasCotizadas() {
        return nHorasCotizadas;
    }

    public void setnHorasCotizadas(int nHorasCotizadas) {
        this.nHorasCotizadas = nHorasCotizadas;
    }
}
