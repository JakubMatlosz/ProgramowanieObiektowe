import java.util.ArrayList;
import java.util.List;


public class DataBase {
    private List<Vehicle> vehicles;

    public DataBase() {
        vehicles = new ArrayList<>();
    }

    public void AddVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Pojazd dodany");
    }

    public boolean RemoveVehicle(String Plate) {
        vehicles.remove(Plate);
        System.out.println("Pojazd usunięty");
        return false;
    }
}