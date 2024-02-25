public class Rectangle extends Figura {
    double l1, l2;

    public Rectangle(double i, double i1) {
        l1 = i;
        l2 = i1;
    }

    @Override
    public double area() {
        return l1+l2;
    }
}
