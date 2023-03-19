import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Run();
    }
    public static void Run()
    {
        System.out.println("\t\tKALKULATOR");
    Scanner input= new Scanner(System.in);
    boolean wyjdz = true;
    do {
        Menu();
        System.out.println("___________________________");
        System.out.print("Twoje działanie: ");
        int czynnosc = input.nextInt();
        switch (czynnosc) {
            case 1:
                System.out.println("___________________________");
                System.out.println("\t\t\tSUMA");
                System.out.println("___________________________");
                int a = InputInt();
                int b = InputInt();
                System.out.println("a= " + a);
                System.out.println("b= " + b);
                Suma(a, b);
                System.out.println("___________________________");
                break;
            case 2:
                System.out.println("___________________________");
                System.out.println("\t\t\tRÓŻNICA");
                System.out.println("___________________________");
                int a1 = InputInt();
                int b1 = InputInt();
                System.out.println("a= " + a1);
                System.out.println("b= " + b1);
                Roznica(a1, b1);
                System.out.println("___________________________");
                break;
            case 3:
                System.out.println("___________________________");
                System.out.println("\t\t\tILOCZYN");
                System.out.println("___________________________");
                int a2 = InputInt();
                int b2 = InputInt();
                System.out.println("a= " + a2);
                System.out.println("b= " + b2);
                Iloczyn(a2, b2);
                System.out.println("___________________________");
                break;
            case 4:
                System.out.println("___________________________");
                System.out.println("\t\t\tILORAZ");
                System.out.println("___________________________");
                int a3 = InputInt();
                int b3 = InputInt();
                System.out.println("a= " + a3);
                System.out.println("b= " + b3);
                Iloraz(a3, b3);
                System.out.println("___________________________");
                break;
            case 5:
                System.out.println("___________________________");
                System.out.println("\t\t\tPOTĘGA");
                System.out.println("___________________________");
                int a4 = InputInt();
                int b4 = InputInt();
                System.out.println("a= " + a4);
                System.out.println("potęga= " + b4);
                Potega(a4, b4);
                System.out.println("___________________________");
                break;
            case 6:
                System.out.println("___________________________");
                System.out.println("  FUNKCJA TRYGONOMETRYCZNA");
                System.out.println("___________________________");
                int a5 = InputInt();
                System.out.println("a= " + a5);
                funTryg(a5);
                System.out.println("___________________________");
                break;
            case 7:
                System.out.println("PROGRAM ZAKOŃCZONY");
                System.exit(0);
            default:
                System.out.println("Podaj poprawne działanie");
                break;

        }
        Close();
        }

    while(wyjdz);
    }

    public static void Menu()
    {
        System.out.println("___________________________");
        System.out.println("Wybierz działanie:");
        System.out.println("1.Suma");
        System.out.println("2.Różnica");
        System.out.println("3.Iloczyn");
        System.out.println("4.Iloraz");
        System.out.println("5.Potega");
        System.out.println("6.Funkcja Trygonometryczna");
        System.out.println("7.Koniec programu");

    }
    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj Liczbe: ");
        int liczba = input.nextInt();
        return liczba;
    }
    public static String InputStrign()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Odpowiedź: ");
        String odpowiedz = input.nextLine();
        return odpowiedz;
    }

    public static void Suma(int a, int b)
    {
        int suma = a+b;
        System.out.format("Suma liczb %d i %d jest równa %d\n",a,b,suma);

    }
    public static void Roznica(int a1, int b1)
    {
        int roznica = a1-b1;
        System.out.format("Roznica liczb %d i %d jest równa %d\n",a1,b1,roznica);

    }
    public static void Iloczyn(int a2, int b2)
    {
        int iloczyn = a2*b2;
        System.out.format("Iloczyn liczb %d i %d jest równy %d\n",a2,b2,iloczyn);

    }
    public static void Iloraz(int a3, int b3)
    {
        double iloraz = (float)a3/(float)b3;
        System.out.format("Iloraz liczb %d i %d jest równy %.2f\n",a3,b3,iloraz);

    }
    public static void Potega(int a4, int b4)
    {
        double potega = Math.pow(a4,b4);
        System.out.format("Liczba %d podniesiona do potęgi %d jest równa %.2f\n",a4,b4,potega);

    }
    public static void funTryg(int a5)
    {
        double funtrygsin = Math.sin(a5);
        double funtrygcos = Math.cos(a5);
        double funtrygtg = Math.tan(a5);
        double funtrygctg = 1/Math.tan(a5);

        System.out.format("Sinus liczby %d jest równy %.2f\n",a5,funtrygsin);
        System.out.format("Cosinus liczby %d jest równy %.2f\n",a5,funtrygcos);
        System.out.format("Tangens liczby %d jest równy %.2f\n",a5,funtrygtg);
        System.out.format("Cotangens liczby %d jest równy %.2f\n",a5,funtrygctg);
    }
    public static void Close() {
        System.out.println("Czy chcesz wyjsc? TAK Kończy działanie programu");
        String znak = InputStrign();
        String st2="TAK";
        if (znak.equals(st2)) {
            System.out.println("PROGRAM ZAKOŃCZONY");
            System.exit(0);
        }
    }

}