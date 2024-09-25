
public class Tablero {
    private Casillero[][] casilleros = new Casillero[8][8];
    private final Integer size = 8;

    public Tablero() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.casilleros[i][j] = new Casillero(i, j);
            }
        }
    }

    public void dibujar() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.casilleros[i][j].dibujar();
            }
            System.out.println();
        }
    }

    public void setearPieza(Pieza pieza, Casillero casillero) {
        casillero.setPieza(pieza);
    }

    public Casillero getCasillero(int x, int y) {
        return this.casilleros[x][y];
    }
    
    public void moverPieza(Pieza pieza, int x, int y) {
    	try {
    		pieza.mover(this.getCasillero(x, y));
    	} catch (Exception e) {
        	System.out.println("movimiento invalido");
        	System.out.println(e);
	    }
    }
}
