import java.util.Scanner;

public class cf1204B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int min = scan.nextInt();
        int max = scan.nextInt();

        // Calculating minimum sum first
        int prevNum = 1;
        int minSum = 1;

        // Loop to find the highest number within minimum amt of different numbers
        for (int i = 1; i < min; i++) {
            // increment by multiplying by 2
            minSum += prevNum * 2;
            prevNum *= 2;
        }

        // After getting the highest possible number, assume the rest of array are 1s
        minSum += n - min;


        // Calculating maximum sum (pretty much same process as minimum sum)
        int maxSum = 1;
        int highestNum = 1;
        prevNum = 1;
        for (int i = 1; i < max; i++) {
            maxSum += prevNum * 2;
            highestNum = prevNum * 2;
            prevNum *= 2;
        }

        // After getting maximum number, assume the rest of array is the maximum number
        maxSum += highestNum * (n - max);



        System.out.println(minSum + " " + maxSum);
    }
}
