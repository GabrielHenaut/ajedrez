public class Juego {
    private Tablero tablero;
    private Juegador blanco, negro;
    private boolean turnoBlaco;

    public Juego() {
        this.tablero = new Tablero();
        this.blanco = new Juegador(true, this.tablero);
        this.negro = new Juegador(false, this.tablero);
    }

    public void comenzar() {
    	System.out.println("INICIO");
    	tablero.dibujar();
    	
//    	System.out.println("CREA PEON");
//        Casillero casillero = tablero.getCasillero(0, 0);
//        Peon peon = new Peon(casillero, ColorPieza.BLANCA);
//        tablero.setearPieza(peon, casillero);
//        tablero.dibujar();
//
//        System.out.println("MOVER INICIAL");
//    	tablero.moverPieza(peon, 2, 0);
//        tablero.dibujar();
//
//        System.out.println("MOVER INICIAL");
//        tablero.moverPieza(peon, 4, 0);
//        tablero.dibujar();
//
//        System.out.println("MOVER");
//        tablero.moverPieza(peon, 3, 0);
//        tablero.dibujar();
    }
}
