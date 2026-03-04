/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacioncuadratica;

public class EcuacionCuadratica {

    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Calcula el discriminante
    public double obtenerDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double obtenerRaiz1() {

        if (obtenerDiscriminante() < 0)
            return 0;

        return (-b + Math.sqrt(obtenerDiscriminante())) / (2 * a);
    }

    public double obtenerRaiz2() {

        if (obtenerDiscriminante() < 0)
            return 0;

        return (-b - Math.sqrt(obtenerDiscriminante())) / (2 * a);
    }
}
