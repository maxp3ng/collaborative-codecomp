import java.util.Arrays;
import java.util.Scanner;

public class cf764B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];


        // Approach is just reverse every odd-index value with its counterpart
        // This question is awful for java, two pointer doesn't work,
        // while loop doesn't work, a normal forloop doesnt work,
        // just this specific variation is able to pass with 2ms left

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }


        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n / 2; i += 2) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


          // edge case
//        if (n == 1) {
//            System.out.println(scan.next());
//            return;
//        }

//        StringBuilder strLeft = new StringBuilder(n / 2);
//        StringBuilder strRight = new StringBuilder(n / 2);
//        if (n % 2 == 0) {
//            while (left < right) {
//                long temp = arr[left];
//
//                arr[left] = arr[right];
//                arr[right] = temp;
//
//
//                strLeft.append(arr[left]);
//                strLeft.append(' ');
//                strLeft.append(arr[left + 1]);
//                strLeft.append(' ');
//
//                strRight.append(' ');
//                strRight.append(arr[right]);
//                strRight.append(' ');
//                strRight.append(arr[right - 1]);
//
//                left += 2;
//                right -= 2;
//            }
//        } else {
//            while (left < right) {
//                long temp = arr[left];
//
//                arr[left] = arr[right];
//                arr[right] = temp;
//
//
//                strLeft.append(arr[left]);
//                strLeft.append(' ');
//                strLeft.append(arr[left + 1]);
//                strLeft.append(' ');
//
//                strRight.append(' ');
//                strRight.append(arr[right]);
//                strRight.append(' ');
//                strRight.append(arr[right - 1]);
//
//                left += 2;
//                right -= 2;
//            }
//            strLeft.delete(n - 1, n + 1);
//        }
//
//
//        strRight.reverse();
//        System.out.print(strLeft);
//        System.out.print(strRight);

        // System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]);
//            System.out.print(" ");
//        }


    }
}
