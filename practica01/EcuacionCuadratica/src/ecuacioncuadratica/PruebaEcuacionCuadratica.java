/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacioncuadratica;

import java.util.Scanner;

public class PruebaEcuacionCuadratica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        EcuacionCuadratica ecuacion =
                new EcuacionCuadratica(a, b, c);

        double discriminante =
                ecuacion.obtenerDiscriminante();

        if (discriminante > 0) {

            System.out.println("La ecuacion tiene dos raices: "
                    + ecuacion.obtenerRaiz1() + " y "
                    + ecuacion.obtenerRaiz2());

        } else if (discriminante == 0) {

            System.out.println("La ecuacion tiene una raiz: "
                    + ecuacion.obtenerRaiz1());

        } else {

            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}