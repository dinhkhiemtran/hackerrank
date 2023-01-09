import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> array){
        int positives = 0;
        int negatives = 0;
        int zero = 0;
        int sizeOfArray = array.size();
        for (int i = 0; i < sizeOfArray; i++){
            if (array.get(i) > 0){
                positives++;
            } else if (array.get(i) < 0) {
                negatives++;
            }else {
                zero++;
            }
        }
        double ratiosPositive = (double) positives/sizeOfArray;
        double ratiosNegative = (double) negatives/sizeOfArray;
        double ratiosZero = (double) zero/sizeOfArray;
        System.out.println(String.format("%,.6f", ratiosPositive));
        System.out.println(String.format("%,.6f", ratiosNegative));
        System.out.println(String.format("%,.6f", ratiosZero));
    }

    public static List<Integer> test1(){
        return new ArrayList<>(Arrays.asList(1,1,0,-1,-1));
    }

    public static List<Integer> test2(){
        return new ArrayList<>(Arrays.asList(-4,3,-9,0,4,1));
    }

    public static void display(){
        List<Integer> array1 = test1();
        List<Integer> array2 = test2();
        System.out.println("Result->");
        plusMinus(array1);
        System.out.println("Result->");
        plusMinus(array2);
    }

    public static void main(String[] args) {
        display();
    }
}
