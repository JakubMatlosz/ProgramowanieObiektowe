public class Motorcycle extends Vehicle{
    private int Capacity;

    public Motorcycle(String plate, String mark, String model, int course, int year_Of_Production, int capacity) {
        super(plate, mark, model, course, year_Of_Production);
        Capacity = capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

    @Override
    public void Write()
    {
        super.Write();
        System.out.println("Pojemność silnika: "+Capacity);
    }
}
