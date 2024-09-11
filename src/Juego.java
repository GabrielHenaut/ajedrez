public class Juego {
    private Tablero tablero;
    private Juegador blanco, negro;
    private boolean turnoBlaco;

    public Juego() {
        this.tablero = new Tablero();
    }

    public void comenzar() {
        Casillero casillero = tablero.getCasillero(0, 0);
        Peon peon = new Peon(casillero);
        tablero.setearPieza(peon, casillero);
        peon.mover(tablero.getCasillero(0, 2));
        tablero.dibujar();
    }
}
