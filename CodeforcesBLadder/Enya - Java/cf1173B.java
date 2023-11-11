import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cf1173B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n == 1) {
            System.out.println(1);
            System.out.println(1 + " " + 1);
            return;
        }

        int currSize = 2;
        while (true) {
            if (currSize * 2 < n) {
                currSize++;
            } else {
                int x = 1;
                int y = 1;
                int currNum = 2;
                boolean found = false;
                List<Integer> listX = new ArrayList<>();
                List<Integer> listY = new ArrayList<>();

                while (!found) {
                    if (x > currSize) {
                        x = 1;
                        y++;
                    }
                    if (y > currSize) {
                        break;
                    }


                    if (Math.abs(1 - x) + Math.abs(1 - y) >= Math.abs(1 - currNum)) {
                        listX.add(x);
                        listY.add(y);
                        currNum++;
                        x++;
                    } else {
                        x++;
                    }

                    if (currNum > n) {
                        found = true;
                    }
                }

                if (found) {
                    System.out.println(currSize);
                    System.out.println(1 + " " + 1);
                    for (int i = 0; i < listX.size(); i++) {
                        System.out.print(listY.get(i) + " ");
                        System.out.println(listX.get(i));
                    }
                    break;
                } else {
                    currSize++;
                }
            }

        }
    }
}
