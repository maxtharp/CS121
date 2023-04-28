package Interfaces;

public class testThing {
    public static void main(String[] args) {
        Thing person = new Person("Maxwell Tharp", 18, 1.0);
        System.out.println(person);

        Thing building = new Building("123 Main Street", 100.0);
        System.out.println(building);
    }
}