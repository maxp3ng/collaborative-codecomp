import java.util.Scanner;

public class cf746B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String str = scan.next();
        StringBuilder out = new StringBuilder();

        // easier to read if you debug, but it's pretty optional
        for (int i = 0; i < n; i++) {
            out.append("_");
        }

        // Approach:
        // loop through input regularly, use stringbuilder to alter the characters individually
        // start at middle -> 1 character to left of middle -> 1 character to right of middle -> 2 characters to left of middle -> so on...

        // keeps track of which side we're on
        // (having 2 variables is actually redundant, only one is necessary for this code)
        boolean left = false;
        boolean right = false;
        int center = 0;

        // alters center based on whether input is even/odd
        if (n % 2 == 0) {
            center = (n / 2) - 1;

            // if even, we will start with center (leaning towards left), and then alternate to right
            left = false;
            right = true;
        } else {
            center = ((n + 1) / 2) - 1;

            // if odd, we will start exactly in the center, and move to the left
            left = true;
            right = false;
        }

        int temp = center;
        int increment = 0;
        for (int i = 0; i < n; i++) {
            // increment stands for characters away from center, increase 1 every other loop
            if (i % 2 != 0) {
                increment++;
            }

            // alters direction of the increment (left or right)
            if (i != 0) {
                if (left) {
                    temp -= increment;
                    left = false;
                    right = true;
                } else {
                    temp += increment;
                    left = true;
                    right = false;
                }
            }

            // changes the individual character
            out.setCharAt(temp, str.charAt(i));

            // reset temp to the center, increment still increases
            temp = center;
        }
        System.out.println(out);

    }
}
