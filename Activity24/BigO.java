package Activity24;

public class BigO {
    static String[] cars = new String[]{"Corolla", "Accord", "Civic", "Highlander", "Landcruiser"};
    public static String printItem(int num) {
        return cars[num];
    }
    public static void printMultiple(int num1) {
        for (int i = 0; i < num1; i++) {
            java.lang.System.out.print(cars[i]);
        }
    }
}

