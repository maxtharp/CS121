package activity26;

public class Test {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] unsortedArray = sorting.getArray();

        System.out.println("unsorted array:");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        int[] sortedArray = sorting.sortArray(unsortedArray);

        System.out.println("sorted array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }

}
