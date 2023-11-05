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
            // All if-statements are comparing char to their ASCII value

            // Checks if char is a number and directly adds to output if so
            if (intent.charAt(i) < 65) {
                out.append(intent.charAt(i));
            } else {
                boolean up = false;
                String character = String.valueOf(intent.charAt(i));

                // if char is uppercase temporarily set to lowercase and use boolean value to remember it was once uppercase
                if (intent.charAt(i) < 97) {
                    String input = String.valueOf(intent.charAt(i));
                    up = true;
                    character = input.toLowerCase();

                }

                // loop through first layout to find the given char
                // then use its index to locate the corresponding char on the second layout
                // add to output
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
