
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Zadanie1());
        System.out.println("___________________");
        System.out.println(Zadanie5());
        System.out.println("___________________");
        System.out.println(Zadanie6());
        System.out.println("___________________");



    }

    public static String Zadanie1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadanie 1");
        System.out.println("Podaj współczynniki A,B,C");
        System.out.print("a= ");
        int a = input.nextInt();
        System.out.print("b= ");
        int b = input.nextInt();
        System.out.print("c= ");
        int c = input.nextInt();
        int delta = (b * b) - (4 * a * c);
        System.out.println("Delta równa= " + delta);
        if (a == 0) {
            System.out.println("Równanie liniowe");
        } else if (delta > 0) {
            System.out.println("Dwa miejsca zerowe");
            double sqrtdelta = Math.sqrt(delta);
            double x1 = ((-1 * b) + sqrtdelta) / (2 * a);
            double x2 = ((-1 * b) - sqrtdelta) / (2 * a);
            System.out.println("Pierwiastek z delty wynosi: " + sqrtdelta);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (delta == 0) {
            System.out.println("Jedno miejsce zerowe");
            double x1 = (double) (-1 * b) / (2 * a);
            System.out.println("x1=" + x1);
        } else
            System.out.println("Brak miejsc zerowych");
        return "Koniec zadania";
    }

    public static String Zadanie5() {
        System.out.println("Zadanie 5");
        for (int i = 20; i >= 0; i--) {
            if (i == 19 || i == 15 || i == 9 || i == 6 || i == 2) {
                continue;
            }
            System.out.print(" " + i);
        }
        return "\nKoniec zadania";
    }

    public static String Zadanie6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadanie 6");
        while (true) {
            System.out.print("Podaj liczbę: ");
            int liczba = input.nextInt();
            if (liczba < 0) {
                break;
            }
        }
        return "Koniec zadania";
    }
}