package Activity12;
public class Car {
    String model;
    String color;
    String year;
    String mileage;

    public Car(String model, String color, String year, String mileage)
    {
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    void display()
    {
        System.out.printf("Model: %s\nColor: %s\nYear: %s\nMileage: %s\n%n", model, color, year, mileage);
    }
}
