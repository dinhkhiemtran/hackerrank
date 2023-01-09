import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> array) {
        int mainDiagonal = 0;
        int subDiagonal = 0;
        int lengthOfArray = array.size();
        try {
            for (int i = 0; i < lengthOfArray; i++) {
                mainDiagonal += array.get(i).get(i);
                subDiagonal += array.get(i).get(array.size() - 1 - i);
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        int result = Math.abs(mainDiagonal - subDiagonal);
        return result;
    }

    public static List<List<Integer>> test1() {
        List<List<Integer>> array = new ArrayList<>();
        array.add(new ArrayList<>());
        array.get(0).add(0, 1);
        array.get(0).add(1, 2);
        array.get(0).add(2, 3);
        array.add(new ArrayList<>());
        array.get(1).add(0, 4);
        array.get(1).add(1, 5);
        array.get(1).add(2, 6);
        array.add(new ArrayList<>());
        array.get(2).add(0, 9);
        array.get(2).add(1, 8);
        array.get(2).add(2, 9);
        return array;
    }

    public static List<List<Integer>> test2() {
        List<List<Integer>> array = Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12));
        return array;
    }

    public static void main(String[] args) {
        List<List<Integer>> testCase1 = test1();
        List<List<Integer>> testCase2 = test2();
        int result1 = diagonalDifference(testCase1);
        int result2 = diagonalDifference(testCase2);
        System.out.println("Result1-> " + result1);
        System.out.println("Result2-> " + result2);
    }
}
