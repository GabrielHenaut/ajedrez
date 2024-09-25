public class Casillero {
    private Pieza pieza;
    int x,y;
   
    public Casillero(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pieza getPieza() {
		return pieza;
	}
	

	public void dibujar() {
        if (this.pieza != null) {
            pieza.dibujar();
            System.out.print(" |");
        } else {
            System.out.print("* |");
        }
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }


}
