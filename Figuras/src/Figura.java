public abstract class Figura implements  Comparable<Figura> {
    public abstract double area();

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.area(), o.area());
    }
}
