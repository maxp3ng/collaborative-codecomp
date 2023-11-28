import java.util.Scanner;

public class cf1023B {
    public static void main(String[] args) {
        // love you dad <3
        Scanner scan = new Scanner(System.in);

        long toys = scan.nextLong();
        long k = scan.nextLong();

        if (k <= toys) {
            System.out.println(k % 2 == 0? k / 2 - 1: k / 2);
            return;
        }

        // minimum possible term

        // maximum possible term
//        long max = k - toys;
//        long min = k - max;
//
//        // finding amount of terms in between
//        long terms = Math.abs(max - min);
//
//        System.out.println(Math.max(0, (terms / 2) + 1));

        long max = toys;
        long min = k - max;
        if (min >= max) {
            System.out.println(0);
        } else {
            System.out.println((max - min + 1) / 2);
        }

//        if (k % 2 == 0 && k / 2 >= min && k / 2 <= max) {
//            System.out.println( (max - min) /2  - 1);
//        } else {
//            System.out.println((max - min) / 2);
//        }




    }
}
