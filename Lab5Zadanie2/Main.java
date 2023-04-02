import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wybierz ilość budynków: ");
        int choice = input.nextInt();
        input.nextLine();
        String[] name = new String[100];
        int[] floors = new int[100];
        int[] year = new int[100];
        int[] month = new int[100];
        int[] day = new int[100];
        for (int i = 0; i < choice; i++) {
            System.out.print("Budynek ["+(i+1)+"]= ");
            name[i]=input.nextLine();
            System.out.print("Rok Budowy ["+(i+1)+"]= ");
            year[i]=input.nextInt();
            System.out.print("Miesiąc Budowy ["+(i+1)+"]= ");
            month[i]=input.nextInt();
            System.out.print("Dzień Budowy ["+(i+1)+"]= ");
            day[i]=input.nextInt();
            System.out.print("Piętra ["+(i+1)+"]= ");
            floors[i]=input.nextInt();
            input.nextLine();
            System.out.println("__________________");
        }
        for (int i = 0; i <choice ; i++) {
            Building building = new Building(name[i], year[i], month[i], day[i], floors[i]);
            building.wypisz();
            LocalDate data=LocalDate.of(year[i],month[i],day[i]);
            LocalDate dataobecna=LocalDate.now();
            Period diff = Period.between(data,dataobecna);
            System.out.println("Różnica między datami: " + diff.getYears() + " lat, " + diff.getMonths() + " miesięcy, " + diff.getDays() + " dni.");
            System.out.println("__________________");
            System.out.println();

        }


    }
}