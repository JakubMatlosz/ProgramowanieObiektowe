public class Truck extends Vehicle{
    private int Load;

    public Truck(String plate, String mark, String model, int course, int year_Of_Production, int load) {
        super(plate, mark, model, course, year_Of_Production);
        Load = load;
    }

    public int getLoad() {
        return Load;
    }

    @Override
    public void Write(){
        super.Write();
        System.out.println("Ładowność: "+Load);
    }
}

