/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadistica;

public class Estadistica {

    private final double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double calcularPromedio() {

        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma / numeros.length;
    }

    public double calcularDesviacion() {

        double promedio = calcularPromedio();
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - promedio, 2);
        }

        return Math.sqrt(suma / (numeros.length - 1));
    }
}
