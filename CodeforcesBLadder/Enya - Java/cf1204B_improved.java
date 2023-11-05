import java.util.Scanner;

public class cf1204B_improved {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Tried to make a better version of previous code because I realized it could easily be
        // condensed into 1 forloop instead of having 2 but it for some this reason takes longer? 

        // 108ms original -> 124ms 'improved' version

        int n = scan.nextInt();
        int min = scan.nextInt();
        int max = scan.nextInt();

        int prevNum = 1;
        int minSum = 1;
        int maxSum = 1;
        int highestNum = 1;
        for (int i = 1; i < max; i++) {
            if (i < min) {
                minSum += prevNum * 2;
            }
            maxSum += prevNum * 2;
            highestNum = prevNum * 2;
            prevNum *= 2;
        }

        minSum += n - min;
        maxSum += highestNum * (n - max);

        System.out.println(minSum + " " + maxSum);
    }
}
