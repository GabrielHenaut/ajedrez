import java.awt.*;

public class Peon extends Pieza {

    public Peon(Casillero casillero) {
        super(casillero, 'P');
    }

    @Override
    public void mover(Casillero casilleroDestino) {
        Casillero origen = this.getCasillero();
        origen.setPieza(null);
        this.setCasillero(casilleroDestino);
        casilleroDestino.setPieza(this);
    }

    @Override
    public void dibujar() {
        System.out.print(this.getNombre());
    }
}
