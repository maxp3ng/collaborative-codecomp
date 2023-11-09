import java.util.Scanner;

public class cf935B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String str = scan.next();

        int x = 0;
        int y = 0;

        int coins = 0;
        boolean up = false;
        boolean right = false;
        boolean gate = false;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'U') {
                y++;
                if (gate && up) {
                    coins++;
                    gate = false;
                }
                up = true;
                right = false;
            } else {
                x++;
                if (gate && right) {
                    coins++;
                    gate = false;
                }
                right = true;
                up = false;
            }

            if (x == y) {
                gate = true;
            } else {
                gate = false;
            }
        }
        System.out.println(coins);


    }
}
