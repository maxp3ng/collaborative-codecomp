import java.util.HashMap;
import java.util.Scanner;

public class cf834B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int guards = scan.nextInt();
        String str = scan.next();

        HashMap<int[], Character> map = new HashMap<>();
        HashMap<Integer, int[]> indexes = new HashMap<>();
        int currIndex = 0;
        for (int i = 0; i < n; i++) {
            char curr = str.charAt(i);

            if (map.containsValue(curr)) {
                continue;
            }

            
            int arr[] = new int[2];
            if (str.lastIndexOf(curr) != str.charAt(i)) {
                arr[0] = i;
                arr[1] = str.lastIndexOf(curr);

                map.put(arr, curr);
                indexes.put(currIndex, arr);

                currIndex++;
            }

        }

        // sweeping line algorithm, count the intersections
        int demoArr[] = new int[n];

        for (int i = 0; i < indexes.size(); i++) {
            int arr[] = indexes.get(i);
            int start = arr[0];
            int end = arr[1];

            for (int j = start; j <= end; j++) {
                demoArr[j]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (demoArr[i] > guards) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}



        // second attempt
//        for (int i = 0; i < n; i++) {
//            char curr = str.charAt(i);
//
//            if (guards < 0) {
//                System.out.println("YES");
//                return;
//            }
//
//            for (int j = i + 1; j < str.lastIndexOf(curr); j++) {
//                if (str.charAt(j) == curr) {
//                    break;
//                }
//                if (str.charAt(j) != curr) {
//                    list.add(curr);
//                    guards--;
//                }
//            }
            // first attempt
//            if (list.contains(curr)) {
//                list.remove(Character.valueOf(curr));
//                guards++;
//            } else if (str.substring(i + 1).indexOf(curr) == -1) {
//            } else {
//                list.add(curr);
//                guards--;
//            }
//            if (str.substring(i + 1).indexOf(curr) != -1) {
//                list.add(curr);
//                guards--;
//            }

//        }
//        if (guards < 0) {
//            System.out.println("YES");
//            return;
//        }
//        System.out.println("NO");
//
//
//    }
//}
