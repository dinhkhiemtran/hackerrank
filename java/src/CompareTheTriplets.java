import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
        List<Integer> results = new ArrayList<>();
        int countAlice = 0;
        int countBob = 0;
        int lengthOfAlice = alice.size();
        for (int i = 0; i < lengthOfAlice; i++){
            if (alice.get(i) > bob.get(i)){
                countAlice++;
            }
            if (alice.get(i) < bob.get(i)){
                countBob++;
            }
        }
        results.add(countAlice);
        results.add(countBob);
        return results;
    }

    public static void main(String[] args) {
        List<Integer> alice = Arrays.asList(5,6,7);
        List<Integer> bob = Arrays.asList(3,6,10);
        List<Integer> results = compareTriplets(alice, bob);
        System.out.println("Results-> " + results);
    }
}
