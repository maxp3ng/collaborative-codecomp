import java.util.Scanner;
import java.util.*;

public class cf831B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();
        String intent = scan.next();

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < intent.length(); i++) {
            if (intent.charAt(i) < 65) {
                out.append(intent.charAt(i));
            } else {
                boolean up = false;
                String character = String.valueOf(intent.charAt(i));

                if (intent.charAt(i) < 97) {
                    String input = String.valueOf(intent.charAt(i));
                    up = true;
                    character = input.toLowerCase();

                }

                for (int j = 0; j < str1.length(); j++) {
                    if (character.equals(String.valueOf(str1.charAt(j)))) {
                        if (up) {
                            String input = String.valueOf(str2.charAt(j));
                            out.append(input.toUpperCase());
                        } else {
                            out.append(str2.charAt(j));
                        }
                        break;
                    }
                }
            }
        }

        System.out.println(out);
    }
}
