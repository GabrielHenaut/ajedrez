public class Casillero {
    private Pieza pieza;

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
