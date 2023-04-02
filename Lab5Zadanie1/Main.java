import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________________________________");
        System.out.println("KALKULATOR GEOMETRYCZNY");
        int choice;
        do {
            System.out.println();
            System.out.println("_________________________________");
            System.out.println("Wybierz co chcesz obliczyć");
            Menu();
            System.out.print("Twój wybór: ");
            choice=input.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("--------------");
                    System.out.println("KOŁO");
                    System.out.println("--------------");
                    System.out.print("r=");
                    double r= input.nextDouble();
                    Circle circle = new Circle(r,"Koło");
                    circle.wypisz();
                    break;
                case 2:
                    System.out.println("--------------");
                    System.out.println("KWADRAT");
                    System.out.println("--------------");
                    System.out.print("a=");
                    double a= input.nextDouble();
                    Square square = new Square(a,"Kwadrat");
                    square.wypisz();
                    break;
                case 3:
                    System.out.println("--------------");
                    System.out.println("PROSTOKĄT");
                    System.out.println("--------------");
                    System.out.print("a=");
                    double a1=input.nextDouble();
                    System.out.print("b=");
                    double b=input.nextDouble();
                    Rectangle rectangle = new Rectangle(a1,b,"Prostokąt");
                    rectangle.wypisz();
                    break;
                case 4:
                    System.out.println("--------------");
                    System.out.println("SZEŚCIAN");
                    System.out.println("--------------");
                    System.out.print("a=");
                    double a2=input.nextDouble();
                    Cube cube = new Cube(a2,"Sześćian");
                    cube.wypisz();
                    break;
                case 5:
                    System.out.println("--------------");
                    System.out.println("PROSTOPADŁOŚCIAN");
                    System.out.println("--------------");
                    System.out.print("a=");
                    double a3=input.nextDouble();
                    System.out.print("b=");
                    double b1=input.nextDouble();
                    Cuboid cuboid = new Cuboid(a3,b1,"Prostopadłościan");
                    cuboid.wypisz();
                    break;
                case 6:
                    System.out.println("--------------");
                    System.out.println("KULA");
                    System.out.println("--------------");
                    System.out.print("r=");
                    double r1= input.nextDouble();
                    Sphere sphere = new Sphere(r1,"Kula");
                    sphere.wypisz();
                    break;
                case 7:
                    System.out.println("--------------");
                    System.out.println("STOŻEK");
                    System.out.println("--------------");
                    System.out.print("r=");
                    double r2= input.nextDouble();
                    System.out.print("h=");
                    double h=input.nextDouble();
                    Cone cone = new Cone(r2,h,"Stożek");
                    cone.wypisz();
                    break;
                case 8:
                    System.out.println("--------------");
                    System.out.println("PROGRAM ZAKOŃCZONY");
                    System.out.println("--------------");
                    System.exit(0);
                default:
                    System.out.println("--------------");
                    System.out.println("Podaj poprawny numer");
                    System.out.println("--------------");

            }
        }
        while(choice!=8);
        input.close();
    }
    public static void Menu()
    {
        System.out.println();
        System.out.println("_________________________________");
        System.out.println("1.Koło");
        System.out.println("2.Kwadrat");
        System.out.println("3.Prostokąt");
        System.out.println("4.Sześcian");
        System.out.println("5.Prostopadłościan");
        System.out.println("6.Kula");
        System.out.println("7.Stożek");
        System.out.println("8.Koniec programu");
        System.out.println("_________________________________");
    }
}
