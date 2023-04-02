//sześcian
public class Cube {
    private double a;
    private String name;

    public Cube(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double objetosc(double a)
    {
        return Math.pow(a,3);
    }
    public double poleboczne(double a)
    {
        return 6*a*a;
    }
    public void wypisz()
{
    System.out.format("Figura o nazwie %s o boku %.2f ma objętość równą %.2f i pole boczne równe %.2f",name,a,objetosc(a),poleboczne(a));

}
}
