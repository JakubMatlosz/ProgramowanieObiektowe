public class Car extends Vehicle{
    private int Doors;

    public Car(String plate, String mark, String model, int course, int year_Of_Production, int doors) {
        super(plate, mark, model, course, year_Of_Production);
        Doors = doors;
    }

    public int getDoors() {
        return Doors;
    }

    @Override
    public void Write()
    {
        super.Write();
        System.out.println("Liczba drzwi: "+Doors);
    }
}