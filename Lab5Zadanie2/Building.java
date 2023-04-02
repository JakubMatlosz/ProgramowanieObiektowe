import java.time.LocalDate;

public class Building {
private String name;
private int year;
private int month;
private int day;
private LocalDate date;
private int floors;

    public Building(String name, int year, int month, int day, int floors) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.date = LocalDate.of(year,month,day);
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void wypisz()
    {
        System.out.println("Budynek o nazwie "+name+" wybudowany w "+date+" ma "+floors+" pięter");
    }
}
