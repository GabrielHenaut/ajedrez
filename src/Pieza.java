public abstract class Pieza {
//    private ColorPieza color;
    private Character nombre;
    private Casillero casillero;

    public abstract void mover(Casillero casilleroDestino);
    public abstract void dibujar();

    public Pieza(Casillero casillero, Character nombre) {
        this.casillero = casillero;
        this.nombre = nombre;
    }

    public Character getNombre() {
        return nombre;
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }
}
