package Activity34;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        totalCalories total = new totalCalories();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the calories per day: ");
        double calories = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the diet start date as mm/dd/yyyy: ");
        String startDate = scanner.nextLine();
        System.out.println("Enter the diet end date as mm/dd/yyyy: ");
        String endDate = scanner.nextLine();

        double cal = total.diet(calories, startDate, endDate);
        System.out.printf("Total calories: %.2f cal", cal);
    }
}
