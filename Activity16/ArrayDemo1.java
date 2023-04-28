package Activity16;
import java.util.Arrays;
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {4, 5, 6} };

        for (int[] number : array){
            System.out.print(Arrays.toString(number));
        }
    }
}
