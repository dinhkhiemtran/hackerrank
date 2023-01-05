import java.util.Scanner;

public class SolveMeFirst {

    private static Scanner scanner = new Scanner(System.in);

    public static int solveMeFirst(int numbA, int numbB){
        return numbA + numbB;
    }

    public static void main(String[] args) {
        System.out.print("Number A: ");
        int numbA = scanner.nextInt();
        System.out.print("Number B: ");
        int numbB = scanner.nextInt();
        int sum = solveMeFirst(numbA, numbB);
        System.out.println("Result-> " + sum);
    }
}
