
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBase dataBase = new DataBase();
        System.out.println("BAZA DANYCH POJAZDÓW");
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

        System.out.println("Baza danych otwarta pomyślnie");
        while (true) {
            System.out.println("Wybierz czynność [1-4]");
            MenuChoose();
            int choice;
            int choice_vehicle;
            System.out.println("Twój wybór: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-----------------");
                    System.out.println("Dodanie do bazy danych");
                    System.out.println("Wybierz pojazd który chcesz dodać [1-4]: ");
                    MenuVehicles();
                    System.out.print("Twój wybór: ");
                    choice_vehicle = scanner.nextInt();
                    switch (choice_vehicle) {
                        case 1:

                            System.out.println("SAMOCHÓD");
                            System.out.print("Podaj tablicę rejestracyjną: ");
                            String Plate = scanner.next();
                            System.out.print("Podaj markę: ");
                            String Mark = scanner.next();
                            System.out.print("Podaj model: ");
                            String Model = scanner.next();
                            System.out.print("Podaj Przebieg: ");
                            int Course = scanner.nextInt();
                            System.out.print("Podaj rok produkcji: ");
                            int Year_Of_Prodution = scanner.nextInt();
                            System.out.print("Podaj ilość drzwi: ");
                            int Doors = scanner.nextInt();
                            Car car = new Car(Plate, Mark, Model, Course, Year_Of_Prodution, Doors);
                            dataBase.AddVehicle(car);
                            Statement stmt = null;
                            try {
                                Class.forName("org.sqlite.JDBC");
                                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                                c.setAutoCommit(false);
                                System.out.println("Baza danych otwarta pomyślnie");
                                stmt = c.createStatement();
                                String sql = "INSERT INTO OSOBOWY1 (TABLICA, MARKA, MODEL, PRZEBIEG, DATA, DRZWI) " +
                                        "VALUES ('" + Plate + "', '" + Mark + "', '" + Model + "', " + Course + ", " + Year_Of_Prodution + ", " + Doors + ")";
                                stmt.executeUpdate(sql);
                                stmt.close();
                                c.commit();
                                c.close();
                            } catch ( Exception e ) {
                                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                                System.exit(0);
                            }
                            System.out.println("Rekordy dodane pomyślnie");
                            break;
                        case 2:
                            System.out.println("POJAZD CIĘŻAROWY");
                            System.out.print("Podaj tablicę rejestracyjną: ");
                            String Plate1 = scanner.next();
                            System.out.print("Podaj markę: ");
                            String Mark1 = scanner.next();
                            System.out.print("Podaj model: ");
                            String Model1 = scanner.next();
                            System.out.print("Podaj przebieg: ");
                            int Course1 = scanner.nextInt();
                            System.out.print("Podaj rok produkcji: ");
                            int Year_Of_Prodution1 = scanner.nextInt();
                            System.out.print("Podaj ładowność: ");
                            int Load = scanner.nextInt();

                            Truck truck = new Truck(Plate1, Mark1, Model1, Course1, Year_Of_Prodution1, Load);
                            dataBase.AddVehicle(truck);
                            try {
                                Class.forName("org.sqlite.JDBC");
                                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                                c.setAutoCommit(false);
                                System.out.println("Baza danych otwarta pomyślnie");
                                stmt = c.createStatement();
                                String sql = "INSERT INTO CIĘŻAROWY (TABLICA, MARKA, MODEL, PRZEBIEG, DATA, ŁADOWNOŚĆ) " +
                                        "VALUES ('" + Plate1 + "', '" + Mark1 + "', '" + Model1 + "', " + Course1 + ", " + Year_Of_Prodution1 + ", " + Load + ")";
                                stmt.executeUpdate(sql);
                                stmt.close();
                                c.commit();
                                c.close();
                            } catch ( Exception e ) {
                                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                                System.exit(0);
                            }
                            System.out.println("Rekordy dodane pomyślnie");

                    break;
                        case 3:
                            System.out.println("MOTOCYKL");
                            System.out.print("Podaj tablicę rejestracyjną: ");
                            String Plate2 = scanner.next();
                            System.out.print("Podaj markę: ");
                            String Mark2 = scanner.next();
                            System.out.print("Podaj model: ");
                            String Model2 = scanner.next();
                            System.out.print("Podaj przebieg: ");
                            int Course2 = scanner.nextInt();
                            System.out.print("Podaj rok produkcji: ");
                            int Year_Of_Prodution2 = scanner.nextInt();
                            System.out.print("Podaj pojemność silnika: ");
                            int Capacity = scanner.nextInt();
                            Motorcycle motorcycle = new Motorcycle(Plate2, Mark2, Model2, Course2, Year_Of_Prodution2, Capacity);
                            dataBase.AddVehicle(motorcycle);
                            try {
                                Class.forName("org.sqlite.JDBC");
                                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                                c.setAutoCommit(false);
                                System.out.println("Baza danych otwarta pomyślnie");
                                stmt = c.createStatement();
                                String sql = "INSERT INTO MOTOCYKL (TABLICA, MARKA, MODEL, PRZEBIEG, DATA, POJEMNOŚĆ) " +
                                        "VALUES ('" + Plate2 + "', '" + Mark2 + "', '" + Model2 + "', " + Course2 + ", " + Year_Of_Prodution2 + ", " + Capacity + ")";
                                stmt.executeUpdate(sql);
                                stmt.close();
                                c.commit();
                                c.close();
                            } catch ( Exception e ) {
                                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                                System.exit(0);
                            }
                            System.out.println("Rekordy dodane pomyślnie");


                    break;
                        default:
                            System.out.println("Wybierz poprawny numer");
                            break;
                    }
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("-----------------");
                    System.out.println("Usunięcie z bazy danych");
                    System.out.println("Wybierz pojazd który chcesz usunąć, podaj tablicę rejestracyjną: ");
                    String PlateRemove = scanner.next();
                        Statement stmt = null;
                        try {
                            Class.forName("org.sqlite.JDBC");
                            c = DriverManager.getConnection("jdbc:sqlite:test.db");
                            c.setAutoCommit(false);
                            System.out.println("Baza danych otwarta pomyślnie");
                            stmt = c.createStatement();
                            String sql = "DELETE from OSOBOWY1 where TABLICA='" + PlateRemove + "';";
                            String sql1 = "DELETE from CIĘŻAROWY where TABLICA='" + PlateRemove + "';";
                            String sql2 = "DELETE from MOTOCYKL where TABLICA='" + PlateRemove + "';";
                            stmt.executeUpdate(sql);
                            stmt.executeUpdate(sql1);
                            stmt.executeUpdate(sql2);
                            stmt.close();
                            c.commit();
                            c.close();
                        } catch (Exception e) {
                            System.err.println(e.getClass().getName() + ": " + e.getMessage());
                            System.exit(0);
                        }
                        System.out.println("Rekordy usunięte pomyślnie");
                    System.out.println("-----------------");
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Wyświetlenie z bazy danych");
                    Statement stmt1 = null;
                    try {
                        Class.forName("org.sqlite.JDBC");
                        c = DriverManager.getConnection("jdbc:sqlite:test.db");
                        c.setAutoCommit(false);
                        System.out.println("Baza danych otwarta pomyślnie");
                        stmt1 = c.createStatement();
                        ResultSet rs = stmt1.executeQuery( "SELECT * FROM OSOBOWY1;" );
                        System.out.println("/////////////////////////");
                        System.out.println("\t\tOSOBOWY");
                        System.out.println("/////////////////////////");
                        while ( rs.next() ) {
                            String Plate = rs.getString("TABLICA");
                            String Mark = rs.getString("MARKA");
                            String Model = rs.getString("MODEL");
                            int Course = rs.getInt("PRZEBIEG");
                            int Date = rs.getInt("DATA");
                            int Doors = rs.getInt("DRZWI");

                            System.out.println( "TABLICA = " + Plate );
                            System.out.println( "MARKA = " + Mark );
                            System.out.println( "MODEL = " + Model );
                            System.out.println( "PRZEBIEG = " + Course );
                            System.out.println( "DATA = " + Date );
                            System.out.println( "DRZWI = " + Doors );
                            System.out.println("================================");
                        }
                        rs.close();
                        ResultSet rs1 = stmt1.executeQuery( "SELECT * FROM CIĘŻAROWY;" );
                        System.out.println("/////////////////////////");
                        System.out.println("\t\tCIĘŻĄROWY");
                        System.out.println("/////////////////////////");
                        while ( rs1.next() ) {
                            String Plate = rs1.getString("TABLICA");
                            String Mark = rs1.getString("MARKA");
                            String Model = rs1.getString("MODEL");
                            int Course = rs1.getInt("PRZEBIEG");
                            int Date = rs1.getInt("DATA");
                            int Load = rs1.getInt("ŁADOWNOŚĆ");

                            System.out.println( "TABLICA = " + Plate );
                            System.out.println( "MARKA = " + Mark );
                            System.out.println( "MODEL = " + Model );
                            System.out.println( "PRZEBIEG = " + Course );
                            System.out.println( "DATA = " + Date );
                            System.out.println( "ŁADOWNOŚĆ = " + Load );
                            System.out.println("================================");
                        }
                        rs1.close();
                        ResultSet rs2 = stmt1.executeQuery( "SELECT * FROM MOTOCYKL;" );
                        System.out.println("/////////////////////////");
                        System.out.println("\t\tMOTOCYKL");
                        System.out.println("/////////////////////////");
                        while ( rs2.next() ) {
                            String Plate = rs2.getString("TABLICA");
                            String Mark = rs2.getString("MARKA");
                            String Model = rs2.getString("MODEL");
                            int Course = rs2.getInt("PRZEBIEG");
                            int Date = rs2.getInt("DATA");
                            int Capacity = rs2.getInt("POJEMNOŚĆ");

                            System.out.println( "TABLICA = " + Plate );
                            System.out.println( "MARKA = " + Mark );
                            System.out.println( "MODEL = " + Model );
                            System.out.println( "PRZEBIEG = " + Course );
                            System.out.println( "DATA = " + Date );
                            System.out.println( "POJEMNOŚĆ = " + Capacity );
                            System.out.println("================================");
                        }
                        rs2.close();
                        stmt1.close();
                        c.close();
                    } catch ( Exception e ) {
                        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                        System.exit(0);
                    }
                    System.out.println("Operacja zakończona sukcesem");



            System.out.println("-----------------");
                    break;
                case 4:
                    System.out.println("-----------------");
                    System.out.println("Zakończenie");
                    System.out.println("-----------------");
                    c.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("-----------------");
                    System.out.println("Wybierz poprawny numer");
                    System.out.println("-----------------");
                    break;
            }
        }
    }
        public static void MenuChoose ()
        {
            System.out.println("-----------------");
            System.out.println("1.Dodaj do bazy danych");
            System.out.println("2.Usuń z bazy danych");
            System.out.println("3.Wyświetl z bazy danych");
            System.out.println("4.Zakończ");
            System.out.println("-----------------");
        }
        public static void MenuVehicles ()
        {
            System.out.println("-----------------");
            System.out.println("1.Samochód");
            System.out.println("2.Pojazd ciężarowy");
            System.out.println("3.Motocykl");
            System.out.println("4.Zakończ");
            System.out.println("-----------------");

        }
    public static boolean isPlateExists(Connection c, String tableName, String Plate) throws SQLException {
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " WHERE TABLICA = '" + Plate + "'");
        return rs.next();

    }
    //if (isPlateExists(c, "MOTOCYKL", Plate2)) {
     //   System.out.println("Tablica rejestracyjna już istnieje w bazie danych.");
       // break;
    //}

}