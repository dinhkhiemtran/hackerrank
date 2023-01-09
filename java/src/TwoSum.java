import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbs, int target){
        int lengthOfNumbs = numbs.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < lengthOfNumbs; i++){
            if (map.containsKey(numbs[i])){
                int numberNeeded = map.get(numbs[i]);
                return new int[]{numberNeeded, i};
            } else {
                int targetSubtract = target - numbs[i];
                map.put(targetSubtract, i);
            }
        }
        return new int[2];
    }

    public static void test1(){
        int[] numbs = new int[]{2,7,11,15};
        int target = 9;
        String results = Arrays.toString(twoSum(numbs, target));
        System.out.println(results);
    }

    public static void test2(){
        int[] numbs = new int[]{3,2,4};
        int target = 6;
        String results = Arrays.toString(twoSum(numbs, target));
        System.out.println(results);
    }

    public static void test3(){
        int[] numbs = new int[]{3,3};
        int target = 6;
        String results = Arrays.toString(twoSum(numbs, target));
        System.out.println(results);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
