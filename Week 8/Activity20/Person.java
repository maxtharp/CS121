package Interfaces;

public class Person implements Thing {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public double getMeasure() {
        return height;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age + " height: " + height;
    }
}
