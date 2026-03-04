/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadistica;

import java.util.Scanner;
import java.util.Locale;

public class PruebaEstadistica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        // Fuerza a usar punto como decimal
        entrada.useLocale(Locale.US);

        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros");

        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextDouble();
        }

        Estadistica estadistica = new Estadistica(numeros);

        System.out.printf("El promedio es: %.2f\n",
                estadistica.calcularPromedio());

        System.out.printf("La desviacion estandar es: %.5f\n",
                estadistica.calcularDesviacion());
    }
}