import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> list) {
        long total = list.stream().reduce(0l, (accumulator, currentValue) -> {
            return accumulator + currentValue;
        });
        return total;
    }

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l);
        List<Long> results = Collections.singletonList(aVeryBigSum(list));
        System.out.println("Result-> " + results);
    }
}
