package Activity29;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Generics {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();
        ArrayList<Integer> intArray = new ArrayList<>();
        ArrayList<Double> doubleArray = new ArrayList<>();
        ArrayList<Character> characterArray = new ArrayList<>();
        ArrayList<String> stringArray = new ArrayList<>();

        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);

        doubleArray.add(1.1);
        doubleArray.add(2.2);
        doubleArray.add(3.3);
        doubleArray.add(4.4);
        doubleArray.add(5.5);

        characterArray.add('A');
        characterArray.add('B');
        characterArray.add('C');
        characterArray.add('D');
        characterArray.add('E');

        stringArray.add("Alpha");
        stringArray.add("Beta");
        stringArray.add("Charlie");
        stringArray.add("Delta");
        stringArray.add("Epsilon");

        System.out.print("Integer arraylist: ");
        generic.printArrayInt(intArray);
        System.out.print("Double arraylist: ");
        generic.printArrayDouble(doubleArray);
        System.out.print("Char arraylist: ");
        generic.printArrayChar(characterArray);
        System.out.print("String arraylist: ");
        generic.printArrayString(stringArray);
    }
}
