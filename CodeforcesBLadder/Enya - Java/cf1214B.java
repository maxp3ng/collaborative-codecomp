import java.util.Scanner;

public class cf1214B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int boys = scan.nextInt();
        int girls = scan.nextInt();
        int n = scan.nextInt();

        int valid = 0;
        for (int i = 0; i <= n; i++) {
            if (i <= boys && (n - i) <= girls) {
                valid++;
            }
        }
        System.out.println(valid);

    }
}
