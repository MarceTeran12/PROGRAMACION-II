/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cronometro;

import java.util.Random;

public class PruebaCronometro {

    public static void main(String[] args) {

        int[] numeros = new int[100000];
        Random aleatorio = new Random();

        // Llenar arreglo con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(100000);
        }

        Cronometro cronometro = new Cronometro();

        // Ordenación por selección
        for (int i = 0; i < numeros.length - 1; i++) {
            int posicionMenor = i;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[posicionMenor]) {
                    posicionMenor = j;
                }
            }

            int auxiliar = numeros[i];
            numeros[i] = numeros[posicionMenor];
            numeros[posicionMenor] = auxiliar;
        }

        cronometro.detener();

        System.out.println("Tiempo de ejecucion: "
                + cronometro.lapsoDeTiempo() + " milisegundos");
    }
}
