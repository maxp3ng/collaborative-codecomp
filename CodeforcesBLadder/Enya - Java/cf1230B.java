import java.util.Scanner;

public class cf1230B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Disclaimer this code is soooooo bad im just in a rush

        int n = scan.nextInt();
        int change = scan.nextInt();

        String input = scan.next();
        StringBuilder str = new StringBuilder(input);

        // edge cases
        if (change == 0) {
            System.out.println(input);
            return;
        }

        if (n == 1 && change >= 1) {
            System.out.println(0);
            return;
        }

        
        // changing first character
        if (str.charAt(0) != '1') {
            str.setCharAt(0, '1');
            change--;
        }

        // then the rest
        int index = 1;
        while (change > 0 && index < n) {
            if (str.charAt(index) != '0') {
                str.setCharAt(index, '0');
                change--;
            }
            index++;
        }

        System.out.println(str);
    }
}
