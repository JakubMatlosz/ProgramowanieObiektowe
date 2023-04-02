//stożek
public class Cone {
 private double r;
 private double h;

 private String name;

    public Cone(double r, double h, String name) {
        this.r = r;
        this.h = h;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double l()
    {
        return Math.sqrt(r*r+h*h);
    }
    public double objetosc(double r,double h)
    {
    return (Math.PI*r*r*h)/3;
    }
    public double poleboczne()
    {
        return Math.PI*r*(r+l());
    }
    public void wypisz()
    {
        System.out.format("Figura o nazwie %s o promieniu %.2f wysokości równej %.2f i nachyleniu równym %.2f ma objętość równą %.2f i pole boczne równe %.2f",name,r,h,l(),objetosc(r,h),poleboczne());

    }
}
