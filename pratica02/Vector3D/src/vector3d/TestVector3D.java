/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector3d;
import java.util.Scanner;

public class TestVector3D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Vector A
        System.out.print("Ingrese x de A: ");
        double ax = Double.parseDouble(sc.next().replace(",", "."));

        System.out.print("Ingrese y de A: ");
        double ay = Double.parseDouble(sc.next().replace(",", "."));

        System.out.print("Ingrese z de A: ");
        double az = Double.parseDouble(sc.next().replace(",", "."));

        Vector3D a = new Vector3D(ax, ay, az);

        // Vector B
        System.out.print("\nIngrese x de B: ");
        double bx = Double.parseDouble(sc.next().replace(",", "."));

        System.out.print("Ingrese y de B: ");
        double by = Double.parseDouble(sc.next().replace(",", "."));

        System.out.print("Ingrese z de B: ");
        double bz = Double.parseDouble(sc.next().replace(",", "."));

        Vector3D b = new Vector3D(bx, by, bz);

        // Operaciones
        System.out.println("\nVector A: " + a);
        System.out.println("Vector B: " + b);

        System.out.println("A + B = " + a.suma(b));
        System.out.println("2A = " + a.escalar(2));
        System.out.println("|A| = " + a.magnitud());
        System.out.println("Normal de A = " + a.normal());
        System.out.println("A · B = " + a.productoEscalar(b));
        System.out.println("A x B = " + a.productoVectorial(b));

        sc.close();
    }
}
