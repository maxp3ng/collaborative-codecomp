import java.util.Scanner;

public class cf746B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String str = scan.next();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < n; i++) {
            out.append("_");
        }

        boolean left = false;
        boolean right = false;
        int center = 0;

        if (n % 2 == 0) {
            center = (n / 2) - 1;
            left = false;
            right = true;
        } else {
            center = ((n + 1) / 2) - 1;
            left = true;
            right = false;
        }

        int temp = center;
        int increment = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                increment++;
            }
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

            out.setCharAt(temp, str.charAt(i));

            temp = center;
        }
        System.out.println(out);

    }
}
