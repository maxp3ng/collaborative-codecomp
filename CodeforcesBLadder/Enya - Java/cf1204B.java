import java.util.Scanner;

public class cf1204B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int min = scan.nextInt();
        int max = scan.nextInt();

        int prevNum = 1;
        int minSum = 1;
        for (int i = 1; i < min; i++) {
            minSum += prevNum * 2;
            prevNum *= 2;
        }
        minSum += n - min;


        int maxSum = 1;
        int highestNum = 0;
        prevNum = 1;
        for (int i = 1; i < max; i++) {
            maxSum += prevNum * 2;
            highestNum = prevNum * 2;
            prevNum *= 2;
        }
        if (highestNum == 0) {
            maxSum += n - max;
        } else {
            maxSum += highestNum * (n - max);
        }


        System.out.println(minSum + " " + maxSum);
    }
}
