import java.util.Arrays;
import java.util.Scanner;

public class cf967B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int totalWater = scan.nextInt();
        int minWater = scan.nextInt();

        // array to store all the holes except for the first hole
        double arr[] = new double[n - 1];

        // first hole will be stored by itself for now
        double first = scan.nextDouble();
        double sum = first;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = scan.nextDouble();

            sum += arr[i];
        }

        // sort array to start subtracting the sum by the largest sizes first
        Arrays.sort(arr);

        // start looping backwards to subtract the largest numbers first
        for (int i = n - 2; i >= 0; i--) {
            // (first hole * water) / sum of non-blocked holes
            // check if ^^ is greater than the minimum volume he wants to get out
            if ((first * totalWater) / sum >= minWater) {
                System.out.println(n - 2 - i);
                return;
            }

            sum -= arr[i];
        }

        // code doesn't account for all holes being blocked, added just in case
        System.out.println(n - 1);
    }
}
