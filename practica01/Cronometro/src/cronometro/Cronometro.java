
package cronometro;

public class Cronometro {

    private long tiempoInicio;
    private long tiempoFin;

    
    public Cronometro() {
        tiempoInicio = System.currentTimeMillis();
    }

    
    public long getTiempoInicio() {
        return tiempoInicio;
    }

    
    public long getTiempoFin() {
        return tiempoFin;
    }

    
    public void iniciar() {
        tiempoInicio = System.currentTimeMillis();
    }

    
    public void detener() {
        tiempoFin = System.currentTimeMillis();
    }

    
    public long lapsoDeTiempo() {
        return tiempoFin - tiempoInicio;
    }
}



