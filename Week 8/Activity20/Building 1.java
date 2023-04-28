package Interfaces;

public class Building implements Thing {
    private String address;
    private double area;

    public Building(String address, double area) {
        this.address = address;
        this.area = area;
    }

    @Override
    public double getMeasure() {
        return area;
    }

    @Override
    public String toString() {
        return "address: " + address + " area: " + area;
    }
}







