import java.util.Scanner;

public class cf805B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // Approach: repeat aabb (no c required)
        StringBuilder str = new StringBuilder();
        // boolean keeps track of whether last added character was a or b (for the if statement on line 25)
        boolean a = true;
        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                str.append('a');
                str.append('a');
                a = true;
            } else {
                str.append('b');
                str.append('b');
                a = false;
            }
        }

        // forloop doesnt account for odd number strings, so need to add additional character at the end
        if (n % 2 != 0) {
            if (a) {
                str.append('b');
            } else {
                str.append('a');
            }
        }
        System.out.println(str);

    }
}
