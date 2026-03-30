/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector3d;

public class Vector3D {

    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Suma
    public Vector3D suma(Vector3D v) {
        return new Vector3D(x + v.x, y + v.y, z + v.z);
    }

    // Escalar
    public Vector3D escalar(double r) {
        return new Vector3D(r * x, r * y, r * z);
    }

    // Magnitud
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Normal
    public Vector3D normal() {
        double mag = magnitud();
        return new Vector3D(x / mag, y / mag, z / mag);
    }

    // Producto escalar
    public double productoEscalar(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }

    // Producto vectorial
    public Vector3D productoVectorial(Vector3D v) {
        double nx = y * v.z - z * v.y;
        double ny = z * v.x - x * v.z;
        double nz = x * v.y - y * v.x;
        return new Vector3D(nx, ny, nz);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
