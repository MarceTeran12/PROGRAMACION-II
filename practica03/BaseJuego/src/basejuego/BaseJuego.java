package basejuego;

public class BaseJuego {
    protected int numeroDeVidas;
    protected int record;

    public BaseJuego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("Nuevo record: " + record);
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas");

        if (numeroDeVidas > 0) {
            return true;
        } else {
            System.out.println("GAME OVER");
            return false;
        }
    }
}