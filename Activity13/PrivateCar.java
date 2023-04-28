package Activity13;

public class PrivateCar {
    String model, color;
    private int year, mileage;

    private void setYear(int year){
        this.year = year;
    }
    private void setMileage(int mileage){
        this.mileage = mileage;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getYear(){
        return year;
    }
    public int getMileage(){
        return mileage;
    }
    private String getModel(){
        return model;
    }
    private String getColor(){
        return color;
    }
    public PrivateCar(String model, String color, int year, int mileage)
    {
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    void display()
    {
        System.out.printf("Model: %s\nColor: %s\nYear: %d\nMileage: %d", this.model, this.color, this.year, this.mileage);
    }
}
