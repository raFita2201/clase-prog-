package model;

public final class Local extends Llamada {

    // Necesito poner los constructores, la podemos construir con el vacío pq implícitamente está.
    // Lombok no ve los atributos de herencia.

    public Local(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    public Local() {
    }

    @Override
    public void calcularCoste() {
        this.setCoste(0);
    }
}
