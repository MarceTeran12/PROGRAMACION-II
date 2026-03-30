
package algebravectorial;
import java.util.Scanner;

public class TestAlgebra {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese x de A: ");
            double ax = Double.parseDouble(sc.next().replace(",", "."));
            
            System.out.print("Ingrese y de A: ");
            double ay = Double.parseDouble(sc.next().replace(",", "."));
            
            AlgebraVectorial a = new AlgebraVectorial(ax, ay);
            
            System.out.print("Ingrese x de B: ");
            double bx = Double.parseDouble(sc.next().replace(",", "."));
            
            System.out.print("Ingrese y de B: ");
            double by = Double.parseDouble(sc.next().replace(",", "."));
            
            AlgebraVectorial b = new AlgebraVectorial(bx, by);
            
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("¿Perpendiculares?: " + a.esPerpendicular(b));
        }
    }
}