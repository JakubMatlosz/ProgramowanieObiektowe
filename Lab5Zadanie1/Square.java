//kwadrat
public class Square {
    private double a;
    private String name;

    public Square(double a, String name) {
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
    public double pole(double a)
    {
        return a*a;
    }
    public double obwod(double a)
    {
        return 4*a;
    }
    public void wypisz()
    {
        System.out.format("Figura o nazwie %s o boku %.2f ma pole równe %.2f i obwód równy %.2f",name,a,pole(a),obwod(a));
    }
}
