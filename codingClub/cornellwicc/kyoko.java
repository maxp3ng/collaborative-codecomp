import java.util.Scanner;

public class kyoko {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        int combo = 0;
        int score = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '*' || str.charAt(i) == 'o') {
                if (str.charAt(i) == '*') {
                    score += 100;
                } else {
                    score += 50;
                }
                score += combo;
                combo++;
            } else {
                combo = 0;
            }
        }
        System.out.println(score);
    }
}
