package Activity29;

import java.util.ArrayList;

public class GenericMethods {
    public void printArrayInt(ArrayList<Integer> inputArray){
        for (Integer element : inputArray){
            System.out.printf(" %s", element);
        }
        System.out.println();
    }
    public void printArrayDouble(ArrayList<Double> inputArray) {
        for (Double element : inputArray) {
            System.out.printf(" %s", element);
        }
        System.out.println();
    }
    public void printArrayChar(ArrayList<Character> inputArray) {
        for (Character element : inputArray) {
            System.out.printf(" %s", element);
        }
        System.out.println();
    }
    public void printArrayString(ArrayList<String> inputArray) {
        for (String element : inputArray) {
            System.out.printf(" %s", element);
        }
        System.out.println();
    }
}
