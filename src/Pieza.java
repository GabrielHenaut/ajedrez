public abstract class Pieza {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private ColorPieza color;
    private Character nombre;
    private Casillero casillero;

    public abstract void mover(Casillero casilleroDestino) throws Exception;
    public abstract void dibujar();

    public Pieza(Casillero casillero, ColorPieza color, Character nombre) {
        this.casillero = casillero;
        this.nombre = nombre;
        this.color = color;
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

    @Override
    public String toString() {
        if (color == ColorPieza.BLANCA)
            return ANSI_YELLOW + nombre + ANSI_RESET;
        else
            return ANSI_RED + nombre + ANSI_RESET;
    }
}
