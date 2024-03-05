import java.util.*;

public class katherine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder str = new StringBuilder();
        str.append(42);
        int temp = 0;
        StringBuilder returnString = new StringBuilder();

        for (int i = 1; i < n; i++) {
            StringBuilder test = new StringBuilder(str);
            String ori = String.valueOf(str);
            List<Integer> list = new ArrayList<>();
            list.add(0);

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(j - 1)) {
                    list.add(j);
                }
            }


            for (int j = 1; j < test.length(); j++) {
                if (test.charAt(j) == test.charAt(j - 1)) {
                    test.deleteCharAt(j);
                    j--;
                }
            }

            for (int j = 1; j < list.size(); j++) {
                test.append(list.get(j) - list.get(j - 1));
            }
            test.append(ori.length() - list.get(list.size() - 1));
            str = test;
//            returnString = test;

        }
        System.out.println(str);
    }
}
