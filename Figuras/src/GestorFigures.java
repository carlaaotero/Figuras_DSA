import java.util.Arrays;
import java.util.Comparator;

public class GestorFigures {
    public static double suma(Figura[] v) {
        double suma = 0;
        for (Figura f: v)
            suma += f.area();
        return suma;
    }
    //funció per ordenar figures
    public static void sort (Figura[] v){
        Arrays.sort(v);
        Arrays.sort(v, new Comparator<Figura>() {
            @Override
            public int compare(Figura o1, Figura o2) {
                return Double.compare(o1.area(), o2.area());
            }
        });
        /*for (int i = 0; i < v.length-1; i++){
            int j = i;
            for (int n= i+1; n<v.length; n++){
                if (v[n].area() < v[j].area()){
                    j=n;
                }
            }
            Figura temp = v[i];
            v[i] = v[j] = temp;
        }*/
        System.out.println();
        System.out.println("Ordre d'àrees de petit a gran:");
        for (Figura f:v)
            System.out.println(f.area() +"m\u00B2");
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Triangle(120,8);

        double res = suma(v);

        //passar per pantalla l'àrea de cada figura
        System.out.println("Rectangle: "+v[0].area() + "m\u00B2");
        System.out.println("Cercle: "+v[1].area() + "m\u00B2");
        System.out.println("Quadrat: "+v[2].area()+ "m\u00B2");
        System.out.println("Triangle: "+v[3].area()+ "m\u00B2");

        System.out.println();

        //passar per pantalla la suma de les àrees
        System.out.println("Suma: "+res + "m\u00B2");
        sort(v);
    }
}
