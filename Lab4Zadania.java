import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Zadanie1());
        System.out.println(Zadanie2());
        System.out.println(Zadanie3());
        System.out.println(Zadanie4());
        System.out.println(Zadanie5());
        System.out.println(Zadanie6());
        System.out.println(Zadanie7());
    }

    public static String Zadanie1() {
        Scanner input = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("Zadanie 1");
        System.out.println("____________________");
        System.out.print("Podaj rozmiar tablicy: ");
        int arraysize = input.nextInt();
        int[] array = new int[arraysize];
        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Losowanie();
            System.out.println("Liczba [" + i + "] =" + array[i]);
        }
        int suma = 0;
        for (int item : array) {
            suma = suma + item;
        }
        double avg = (float) suma / (float) array.length;
        System.out.println("Suma jest równa " + suma);
        System.out.println("Średnia jest równa " + avg);

        return "Koniec zadania";
    }

    public static int Losowanie() {
        Random rand = new Random();
        int liczba = rand.nextInt();
        return liczba;
    }

    public static String Zadanie2() {
        Scanner input = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("Zadanie 2");
        System.out.println("____________________");
        System.out.println("Podaj wartośći dla elementów tablicy: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Liczba [" + i + "] = ");
            array[i] = input.nextInt();
        }
        System.out.println("____________________");
        System.out.println("NIEPARZYSTE");
        System.out.println("____________________");
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.println("Liczba [" + i + "] = " + array[i]);
        }
        System.out.println("____________________");
        System.out.println("PARZYSTE");
        System.out.println("____________________");
        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println("Liczba [" + i + "] = " + array[i]);
        }
        System.out.println("____________________");
        return "Koniec zadania";
    }

    public static String Zadanie3() {
        System.out.println("____________________");
        System.out.println("Zadanie 3");
        System.out.println("____________________");
        String[] array = {"Dzisiaj", "jest", "niedziela", "."};
        System.out.println("Wartość tablicy: ");
        for (String item : array) {
            System.out.print(item.toUpperCase() + " ");
        }
        System.out.println();
        return "Koniec zadania";
    }

    public static String Zadanie4() {
        System.out.println("____________________");
        System.out.println("Zadanie 4");
        System.out.println("____________________");
        System.out.println("Podaj 5 słów");
        Scanner input = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Słowo [" + i + "]= ");
            array[i] = input.nextLine();
        }
        System.out.println("Twoje słowa: ");
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Słowa od tyłu: ");
        for (int i = array.length - 1; i >= 0; i--) {
            String array2 = array[i];
            for (int j = array2.length() - 1; j >= 0; j--) {
                System.out.print(array2.charAt(j));

            }
            System.out.print(" ");
        }
        System.out.println();
        return "Koniec zadania";
    }
    public static String Zadanie5()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("Zadanie 5");
        System.out.println("____________________");
        System.out.println("Podaj 8 liczb");
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Liczba ["+i+"]= ");
            array[i]=input.nextInt();

        }
        System.out.println("____________________");
        System.out.println("Oto posortowane liczby: ");
        System.out.println("____________________");
        Arrays.sort(array);
        for (int item:array) {
            System.out.print(item+ " ");
        }
        System.out.println();
        return "Koniec Zadania";
    }

    public static String Zadanie6() {
        Scanner input = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("Zadanie 6");
        System.out.println("____________________");
        System.out.println("Podaj 5 liczb: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Liczba [" + i + "] =");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int factorial = 1;
            for (int j = 1; j <= array[i]; j++) {
                factorial = factorial * j;
            }
            System.out.println(array[i] + "! = " + factorial);
        }
        return "Koniec zadania";
    }

    public static String Zadanie7() {
        Scanner input = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("Zadanie 7");
        System.out.println("____________________");
        System.out.println("Podaj słowa do tablicy 1");
        String[] array = new String[5];
        String[] arraycopy = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Słowo [" + i + "]= ");
            array[i] = input.nextLine();
        }
        System.out.println("____________________");
        System.out.println("Podaj słowa do tablicy 2");
        System.out.println("____________________");
        for (int i = 0; i < arraycopy.length; i++) {
            System.out.print("Słowo [" + i + "]= ");
            arraycopy[i] = input.nextLine();
        }
        System.out.println("Czy te tablice są takie same?");
        System.out.println("Odpowiedź: " + Arrays.equals(array, arraycopy));
        return "Koniec zadania";
    }
}