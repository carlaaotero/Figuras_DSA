public class Triangle extends Figura {
    double b, h;

    public Triangle(double i, double i1) {
        b = i;
        h = i1;
    }
    @Override
    public double area() {
        return (b*h)/2;
    }
}
