/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadistica;

import java.util.Scanner;

public class EstadisticaModular {

    
    public static double promedio(double[] numeros) {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma / numeros.length;
    }

    
    public static double desviacion(double[] numeros) {
        double prom = promedio(numeros);
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - prom, 2);
        }

        return Math.sqrt(suma / (numeros.length - 1));
    }

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }

        System.out.println("El promedio es " + promedio(numeros));
        System.out.println("La desviacion estandar es " + desviacion(numeros));
    }
}


