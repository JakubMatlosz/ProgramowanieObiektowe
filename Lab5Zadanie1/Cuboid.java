//prostopadłościan
public class Cuboid {
    private double a;
    private double b;
    private String name;

    public Cuboid(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double objetosc(double a, double b)
    {
        return a*a*b;
    }
    public double poleboczne(double a, double b)
    {
        return 2*a*a+4*a*b;
    }
    public void wypisz()
    {
        System.out.format("Figura o nazwie %s o boku %.2f ma objętość równą %.2f i pole boczne równe %.2f",name,a,objetosc(a,b),poleboczne(a,b));

    }
}

