public class Cercle extends Figura{
    double r;

    public Cercle(double i) {
        r = i;

    }
    @Override
    public double area() {
        return Math.PI + (r*r);
    }
}
