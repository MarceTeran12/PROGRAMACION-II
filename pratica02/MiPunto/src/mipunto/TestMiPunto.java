/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mipunto;

import java.util.Scanner;

public class TestMiPunto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Punto 1
        System.out.print("Ingrese x1: ");
        double x1 = Double.parseDouble(sc.next().replace(",", "."));

        System.out.print("Ingrese y1: ");
        double y1 = Double.parseDouble(sc.next().replace(",", "."));

        MiPunto p1 = new MiPunto(x1, y1);

        // Punto 2
        System.out.print("Ingrese x2: ");
        double x2 = Double.parseDouble(sc.next().replace(",", "."));

        System.out.print("Ingrese y2: ");
        double y2 = Double.parseDouble(sc.next().replace(",", "."));

        MiPunto p2 = new MiPunto(x2, y2);

        // Distancia
        double distancia = p1.distancia(p2);

        System.out.println("Punto 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Punto 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Distancia = " + distancia);

        sc.close();
    }
}