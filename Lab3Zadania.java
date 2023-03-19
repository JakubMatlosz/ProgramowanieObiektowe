import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Zadanie1());
        System.out.println("_______________________________");
        System.out.println(Zadanie2());
        System.out.println("_______________________________");
        System.out.println(Zadanie3());
        System.out.println("_______________________________");
        System.out.println(Zadanie4());
        System.out.println("_______________________________");
    }
    public static double Zadanie1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadanie 1");
        System.out.print("1.Podaj liczbe studentów: ");
        int studenci = input.nextInt();
        System.out.println("2.Podaj liczbę punktów dla każdego studenta");
        System.out.println("-------");
        int suma = 0;
        for (int i = 1; i < studenci + 1; i++) {
            System.out.println("Student numer [" + i+"]");
            System.out.print("Liczba punktów: ");
            int punkty = input.nextInt();
            suma = suma + punkty;
            System.out.println("-------");
        }
        double sredniapkt = (float) suma/ (float) studenci;
        System.out.print("Średnia pkt to: ");
        return sredniapkt;
    }
    public static String Zadanie2()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadanie 2");
        System.out.println("Podaj 10 dowolnych liczb");
        int suma_ujemnych=0;
        int dodatnia = 0;
        int ujemna=0;
        int suma_dodatnich=0;
        for (int i = 1; i < 11; i++)
        {
            System.out.print("Liczba ["+i+"]= ");
            int liczba= input.nextInt();
                if(liczba>=0)
            {
                suma_dodatnich=suma_dodatnich+liczba;
                dodatnia++;
            }
                else
                {
                    suma_ujemnych=suma_ujemnych+liczba;
                    ujemna++;
                }
        }
        System.out.println("Suma dodatnich liczb jest równa: "+suma_dodatnich);
        System.out.println("Suma ujemnych liczb jest równa: "+suma_ujemnych);
        System.out.println("Ilość dodatnich liczb jest równa: "+dodatnia);
        System.out.println("Ilość ujemnych liczb jest równa: "+ujemna);
        return "Koniec zadania";
    }
    public static int Zadanie3()
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Zadanie 3");
        System.out.print("Podaj ilość liczb: ");
        int iloscliczb= input.nextInt();
        System.out.println("Podaj przedział");
        System.out.print("<1,");
        int przedzial = input.nextInt();
        int suma=0;
        for (int i = 1; i <iloscliczb+1 ; i++)
        {
            int liczba = rand.nextInt(przedzial)+1;
            System.out.println("Liczba ["+i+"]= "+liczba);
            suma= suma+liczba;
        }
        System.out.format("Suma %d liczb z przedziału <1,%d> jest równa: ",iloscliczb,przedzial);
        return suma;
    }
    public static int Zadanie4()
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Zadanie 4");
        System.out.print("Podaj ilość liczb: ");
        int liczby= input.nextInt();
        int suma=0;
        for (int i = 1; i < liczby+1; i++)
        {
            int wartosc= rand.nextInt(56)-10;
            System.out.println("Liczba ["+i+"] ="+wartosc);
            if (wartosc%2==0)
            {
                suma=suma+wartosc;
            }
        }
        System.out.print("Suma parzystych liczb z przedziału <-10,45> wynosi ");
        return suma;
    }
}