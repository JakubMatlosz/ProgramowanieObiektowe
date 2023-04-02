//prostokąt
public class Rectangle {
    private double a;
    private double b;
    private String name;

    public Rectangle(double a, double b, String name) {
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
    public double pole(double a,double b)
    {
        return a*b;
    }
    public double obwod(double a,double b)
    {
        return 2*a+2*b;
    }
    public void wypisz()
    {
        System.out.format("Figura o nazwie %s o boku a= %.2f i b= %.2f ma pole równe %.2f i obwód równy %.2f",name,a,b,pole(a,b),obwod(a,b));

    }
}
