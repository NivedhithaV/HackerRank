import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0, min = 0, max = 0;

        for (int i = 0; i < 5; i++) {
            long input = in.nextLong();
            if (i == 0) {
                sum = min = max = input;
            } else {
                sum += input;
                if (input < min) {
                    min = input;
                }
                if (input > max) {
                    max = input;
                }
            }

        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
