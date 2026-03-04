/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cronometro;

public class Cronometro {

    private long tiempoInicio;
    private long tiempoFin;

    // Constructor sin argumentos
    public Cronometro() {
        tiempoInicio = System.currentTimeMillis();
    }

    // Getter de inicio
    public long getTiempoInicio() {
        return tiempoInicio;
    }

    // Getter de fin
    public long getTiempoFin() {
        return tiempoFin;
    }

    // Reinicia el cronómetro
    public void iniciar() {
        tiempoInicio = System.currentTimeMillis();
    }

    // Detiene el cronómetro
    public void detener() {
        tiempoFin = System.currentTimeMillis();
    }

    // Devuelve el tiempo transcurrido
    public long lapsoDeTiempo() {
        return tiempoFin - tiempoInicio;
    }
}



