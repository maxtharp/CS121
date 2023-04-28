package Activity15;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] firstNames = new String[5];
        String[] lastNames = new String[5];
        int[] grades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("First name: ");
            firstNames[i] = console.nextLine();
            System.out.println("Last name: ");
            lastNames[i] = console.nextLine();
            System.out.println("Grade: ");
            grades[i] = Integer.parseInt(console.nextLine());
        }
        System.out.printf("%-14s %s\n", "Name", "Grade");

        for (int i = 0; i < firstNames.length; i++){
            System.out.printf("%-14s %s\n", firstNames[i] + " " + lastNames[i], grades[i]);
        }
        console.close();
    }
}
