package Activity27;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(24,17,12,91,85,39,6,77,44));
        System.out.print("unsorted: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        Integer[] sortedArray = selectionSort(array);
        System.out.print("sorted: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());
        int found = demo.binarySearch(key, sortedArray);
        if (found == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.printf("Item found at index %d, position %d",found, found + 1);
        }
    }
    public static Integer [] selectionSort(ArrayList<Integer> unsortedArray){
        Integer[] sortedArray = unsortedArray.toArray(new Integer[0]);
        for (int i = 0; i < sortedArray.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < sortedArray.length; j++){
                if (sortedArray[j] < sortedArray[min]) {
                    min = j;
                }
            }
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[min];
            sortedArray[min] = temp;
        }
        return sortedArray;
    }
}
