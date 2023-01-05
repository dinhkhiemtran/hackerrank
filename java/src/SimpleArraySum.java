import java.util.Arrays;

public class SimpleArraySum {

    public static int simpleArray(int[] array){
        int accumulator = 0;
        for (int i = 0; i < array.length; i++){
            accumulator += array[i];
        }
        return accumulator;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10, 11};
        int total = simpleArray(array);
        System.out.println("Result-> " + total);
    }
}
