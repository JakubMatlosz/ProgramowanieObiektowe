public class Vehicle {
    protected String Plate;
    protected String Mark;
    protected String Model;
    protected int Course;
    protected int Year_Of_Production;
    private Object plate;

    public Vehicle(String plate, String mark, String model, int course, int year_Of_Production) {
        Plate = plate;
        Mark = mark;
        Model = model;
        Course = course;
        Year_Of_Production = year_Of_Production;
    }

    public String getMark() {
        return Mark;
    }

    public String getModel() {
        return Model;
    }

    public int getCourse() {
        return Course;
    }

    public int getYear_Of_Production() {
        return Year_Of_Production;
    }

    public void Write()
    {
        System.out.println("Tablica rejestracyjna: "+Plate);
        System.out.println("Marka: "+Mark);
        System.out.println("Model: "+Model);
        System.out.println("Przebieg: "+Course);
        System.out.println("Rok Produkcji: "+Year_Of_Production);
    }

    public Object getPlate() {
        return Plate;
    }

    public void setPlate(Object plate) {
        this.plate = plate;
    }
}
