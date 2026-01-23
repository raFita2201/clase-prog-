package model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Provincial extends Llamada {

    public Provincial(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
        setCosteSegundo(0.15);
        calcularCoste();
    }

    @Override
    public void calcularCoste() {
        setCoste(getDuracion() * getCosteSegundo());
    }
}
