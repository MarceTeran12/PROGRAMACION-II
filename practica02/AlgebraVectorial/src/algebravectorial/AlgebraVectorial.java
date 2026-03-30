
package algebravectorial;

public class AlgebraVectorial {

    private double x;
    private double y;

    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
    }

    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double productoEscalar(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y;
    }

    public boolean esPerpendicular(AlgebraVectorial v) {
        return this.productoEscalar(v) == 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
 