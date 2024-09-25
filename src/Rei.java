
public class Rei extends Pieza {
	private Boolean didInitialMove = false;

    public Rei(Casillero casillero, ColorPieza color) {
        super(casillero, color, 'R');
    }

    @Override
    public void mover(Casillero casilleroDestino) throws Exception {
    	this.didInitialMove = true;
        Casillero origen = this.getCasillero();
        origen.setPieza(null);
        this.setCasillero(casilleroDestino);
        casilleroDestino.setPieza(this);
    }
    
    public void moverInicial(Casillero casilleroDestino) throws MovimientoIlegal {
    	if (this.didInitialMove) {
    		throw new MovimientoIlegal("No es el primer movimiento");
    	}
    	this.didInitialMove = true;
        Casillero origen = this.getCasillero();
        origen.setPieza(null);
        this.setCasillero(casilleroDestino);
        casilleroDestino.setPieza(this);
    }


	@Override
    public void dibujar() {
        System.out.print(this.toString());
    }
}
