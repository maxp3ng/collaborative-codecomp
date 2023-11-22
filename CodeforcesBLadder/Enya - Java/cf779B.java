import java.util.Scanner;

public class cf779B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder num = new StringBuilder(scan.next());
        int originalLength = num.length();
        int k = scan.nextInt();
        double divide = Math.pow(10, k);

        //edge case (if it's already divisible) but im pretty sure this is unnecessary
        if (Integer.parseInt(String.valueOf(num)) % divide == 0) {
            System.out.println(0);
            return;
        }

        // checks and deletes non-zero characters until the leading number of zeros is equal to k
        // (then it will be divisible)

        // loops through from back to front, removes the characters that aren't zero
        for (int i = num.length() - 1; i > 0; i--) {
            if (num.charAt(i) == '0') {
                continue;
            } else {
                num.deleteCharAt(i);
            }

            // checks if amount leading zeros is equal to k
            int count = 0;
            for (int j = num.length() - 1; j >= 0; j--) {
                if (count == k) {
                    System.out.println(originalLength - num.length());
                    return;
                }
                if (num.charAt(j) == '0') {
                    count++;
                } else {
                    break;
                }
            }
        }
        // prints if amount of leading zeros never equals to k
        System.out.println(originalLength - 1);


    }
}
