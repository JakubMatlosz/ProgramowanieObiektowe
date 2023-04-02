//kula
public class Sphere {
    private double r;
    private String name;

    public Sphere(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double objetosc(double r)
    {
        return (float)4/(float)3*Math.PI*Math.pow(r,3);
    }
    public double poleboczne(double r)
    {
        return 4*Math.PI*r*r;
    }
    public void wypisz()
    {
        System.out.format("Figura o nazwie %s o promieniu %.2f ma objętość równą %.2f i pole boczne równe %.2f",name,r,objetosc(r),poleboczne(r));

    }
}
