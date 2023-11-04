import java.util.Arrays;
import java.util.Scanner;

public class cf967B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int totalWater = scan.nextInt();
        int minWater = scan.nextInt();

        double arr[] = new double[n - 1];

        double first = scan.nextDouble();
        double sum = first;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = scan.nextDouble();

            sum += arr[i];
        }

        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {
            if ((first * totalWater) / sum >= minWater) {
                System.out.println(n - 2 - i);
                return;
            }
            sum -= arr[i];
        }
        System.out.println(n - 1);
    }

}

