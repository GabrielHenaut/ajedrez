import java.awt.*;

public class Juegador {
    private Boolean esBlanco;
    private Pieza piezasEnJuego[];
    private Pieza piezasComidas[];
    private Tablero tablero;

    public Juegador(Boolean esBlanco, Tablero tablero) {
        this.esBlanco = esBlanco;
        this.tablero = tablero;
        cargarInicial();
    }

    private void cargarInicial() {
        this.piezasEnJuego = new Pieza[16];
        this.piezasComidas = new Pieza[16];
        if (esBlanco) {
            cargarGeneral(6, esBlanco);
        } else {
            cargarGeneral(1, esBlanco);
        }
    }

    private void cargarGeneral(Integer posInicial, Boolean esBlanco) {
        ColorPieza color;
        if (esBlanco) {
            color = ColorPieza.BLANCA;
        } else {
            color = ColorPieza.NEGRA;
        }
        for (int i = 0; i < 8; i++) {
            Casillero casillero = this.tablero.getCasillero(posInicial, i);
            Pieza pieza = new Peon(casillero, color);
            this.tablero.setearPieza(pieza, casillero);
            this.piezasEnJuego[i] = pieza;
        }
        if (esBlanco) {
            posInicial++;
        } else {
            posInicial--;
        }
        for (int i = 0; i < 8; i++) {
            Casillero casillero = this.tablero.getCasillero(posInicial, i);
            Pieza pieza;
            if (i == 0 || i == 7) {
                pieza = new Torre(casillero, color);
            } else if (i == 1 || i == 6) {
                pieza = new Caballo(casillero, color);
            } else if (i == 2 || i == 5) {
                pieza = new Alfile(casillero, color);
            } else if (i == 3) {
                if (esBlanco) {
                    pieza = new Dama(casillero, color);
                } else {
                    pieza = new Rei(casillero, color);
                }
            } else {
                if (!esBlanco) {
                    pieza = new Dama(casillero, color);
                } else {
                    pieza = new Rei(casillero, color);
                }
            }

            this.tablero.setearPieza(pieza, casillero);
            this.piezasEnJuego[i] = pieza;
        }

    }
}
