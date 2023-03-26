import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Zadanie4());
        System.out.println(Zadanie3());
    }
    public static String Zadanie3()
    {
        Scanner input = new Scanner(System.in);
        final int arrayLen = 10;
        int array[];
        array = new int[arrayLen];
        System.out.println("ZADANIE 3");
        System.out.println("_____________________________");
        System.out.println("Podaj 10 elementów tablicy");
        System.out.println("_____________________________");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Array ["+i+"] =");
           array[i] = input.nextInt();
        }
            int choice;
            do {
                Menu();
                System.out.print("Twoj wybór: ");
                choice = input.nextInt();
            if (choice == 1) {
                System.out.println("_____________________________");
                System.out.println("1.Od pierwszego do ostatniego");
                System.out.println("_____________________________");
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Array [" + i + "]=" + array[i]);
                }
            } else if (choice == 2) {
                System.out.println("_____________________________");
                System.out.println("2.Od ostatniego do pierwszego");
                System.out.println("_____________________________");
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.println("Array [" + i + "]=" + array[i]);
                }
            } else if (choice == 3) {
                System.out.println("_____________________________");
                System.out.println("3.Nieparzyste");
                System.out.println("_____________________________");
                for (int i = 1; i < array.length; i = i + 2) {
                    System.out.println("Array [" + i + "]=" + array[i]);
                }
            } else if (choice == 4) {
                System.out.println("_____________________________");
                System.out.println("4.Parzyste");
                System.out.println("_____________________________");
                for (int i = 0; i < array.length; i = i + 2) {
                    System.out.println("Array [" + i + "]=" + array[i]);
                }
            } else if (choice==5)
                System.out.println("Koniec Programu");
            else
                System.out.println("Błąd wyboru");
        }
        while (choice !=5);
        input.close();
        System.out.println("_____________________________");
        return "Koniec Zadania";
    }
    public static void Menu()
    {
        System.out.println("_____________________________");
        System.out.println("1.Wyświetl elementy tablicy od pierwszego do ostatniego");
        System.out.println("2.Wyświetl elementy tablicy od ostatniego do pierwszego");
        System.out.println("3.Wyświetl elementy Nieparzyste tablicy");
        System.out.println("4.Wyświetl elementy Parzyste tablicy");
        System.out.println("5.Koniec Programu");
        System.out.println("_____________________________");
    }
    public static String Zadanie4()
    {
    Scanner input  = new Scanner(System.in);
        System.out.println("ZADANIE 4");
        System.out.println("_____________________________");
        System.out.println("Podaj 10 elementów tablicy:");
        System.out.println("_____________________________");
        final int arrayLen1 = 10;
        int array2[];
        array2 = new int[arrayLen1];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Array ["+i+"] =");
            array2[i] = input.nextInt();
        }
        int choice2;
        do {
            Menu2();
            System.out.print("Twój wybór:");
            choice2 = input.nextInt();
            switch(choice2)
            {
                case 1:
                    System.out.println("_____________________________");
                    System.out.println("SUMA");
                    System.out.println("_____________________________");
                    int suma=0;
                    for (int i = 0; i < array2.length; i++) {
                        suma = suma+array2[i];
                    }
                    System.out.println("Suma ="+suma);
                    break;
                case 2:
                    System.out.println("_____________________________");
                    System.out.println("ILOCZYN");
                    System.out.println("_____________________________");
                    int iloczyn=1;
                    for (int i = 0; i < array2.length; i++) {
                        iloczyn = iloczyn*array2[i];
                    }
                    System.out.println("Iloczyn= "+iloczyn);
                    break;
                case 3:
                    System.out.println("_____________________________");
                    System.out.println("ŚREDNIA");
                    System.out.println("_____________________________");
                    int suma1=0;
                    for (int i = 0; i < array2.length; i++) {
                        suma1 = suma1+array2[i];
                    }
                    double avg= (float) suma1/ (float) array2.length;
                    System.out.println("Średnia ="+avg);
                    break;
                case 4:
                    System.out.println("_____________________________");
                    System.out.println("MINIMUM");
                    System.out.println("_____________________________");
                    int min = array2[0];
                    for (int i = 0; i < array2.length; i++) {
                        if (array2[i]<min)
                            min=array2[i];
                    }
                    System.out.println("Wartość najmniejsza to "+min);
                    break;
                case 5:
                    System.out.println("_____________________________");
                    System.out.println("MAXIMUM");
                    System.out.println("_____________________________");
                    int max = array2[0];
                    for (int i = 0; i < array2.length; i++) {
                        if (array2[i]>max)
                            max=array2[i];

                    }
                    System.out.println("Wartość największa to "+max);
                    break;
                case 6:
                    System.out.println("Koniec Programu");
            }
        }
        while(choice2!=6);
        return "Koniec zadania";
    }
    public static void Menu2()
    {
        System.out.println("_____________________________");
        System.out.println("1.Oblicz sume elementów tablicy");
        System.out.println("2.Oblicz iloczyn elementów tablicy");
        System.out.println("3.Wyznacz wartość średnią");
        System.out.println("4.Wyznacz wartość min");
        System.out.println("5.Wyznacz wartość max");
        System.out.println("6.Koniec Programu");
        System.out.println("_____________________________");
    }
}