import java.util.Arrays;
import java.util.List;

public class Vector {
    private double a, b, c;
    public Vector(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Vector(Point A, Point B) {
        this.a = B.getX() - A.getX();
        this.b = B.getY() - A.getY();
        this.c = B.getZ() - A.getZ();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public List<Double> getVector() {
        return Arrays.asList(a, b, c);
    }

    public Vector unitVector() {
        double magnitude = Math.sqrt(a * a + b * b + c * c);
        if (magnitude == 0) {
            return new Vector(0, 0, 0);
        }
        return new Vector(a / magnitude, b / magnitude, c / magnitude);
    }

    public double dotProduct(Vector v) {
        return a * v.getA() + b * v.getB() + c * v.getC();
    }

    public Vector crossProduct(Vector v) {
        double crossA = b * v.getC() - c * v.getB();
        double crossB = c * v.getA() - a * v.getC();
        double crossC = a * v.getB() - b * v.getA();
        return new Vector(crossA, crossB, crossC);
    }
}