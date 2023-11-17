import java.util.Scanner;

public class cf984B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int y = scan.nextInt();
        int x = scan.nextInt();

        char arr[][] = new char[y][x];
        int demo[][] = new int[y][x];

        // i want to use int array so bombs will equal a value of 100 :skull:
        for (int i = 0; i < y; i++) {
            String str = scan.next();
            for (int j = 0; j < x; j++) {
                char curr = str.charAt(j);

                if (curr == '*') {
                    demo[i][j] = 100;
                } else if (curr == '.') {
                    demo[i][j] = 0;
                } else {
                    demo[i][j] = 0;
                }
                arr[i][j] = curr;
            }
        }

        // i is row
        // j is colum

        // y = 2, x = 3
        // 0 0 0
        // 0 0 0
        if (y == 2 && x == 3) {
            if (arr[0][1] == '*' || arr[1][1] == '*') {
                demo[0][0]++;
                demo[0][2]++;
                demo[1][0]++;
                demo[1][2]++;
                if (arr[0][1] == '*') {
                    demo[1][1]++;
                }
                if (arr[1][1] == '*') {
                    demo[0][1]++;
                }
            } else {
                if (arr[0][0] == '*') {
                    demo[0][1]++;
                    demo[1][0]++;
                    demo[1][1]++;
                }
                if (arr[0][2] == '*') {
                    demo[0][1]++;
                    demo[1][1]++;
                    demo[1][2]++;
                }
                if (arr[1][0] == '*') {
                    demo[0][0]++;
                    demo[0][1]++;
                    demo[1][1]++;
                }
                if (arr[1][2] == '*') {
                    demo[0][1]++;
                    demo[0][2]++;
                    demo[1][1]++;
                }
            }

            // 0 0
            // 0 0
            // 0 0
        } else if (y == 3 && x == 2) {
            if (arr[1][0] == '*' || arr[1][1] == '*') {
                demo[0][0]++;
                demo[0][1]++;
                demo[2][0]++;
                demo[2][1]++;
                if (arr[1][0] == '*') {
                    arr[1][1]++;
                }
                if (arr[1][1] == '*') {
                    arr[1][0]++;
                }
            } else {
                if (arr[0][0] == '*') {
                    demo[0][1]++;
                    demo[1][0]++;
                    demo[1][1]++;
                }
                if (arr[0][1] == '*') {
                    demo[0][0]++;
                    demo[1][0]++;
                    demo[1][1]++;
                }
                if (arr[2][0] == '*') {
                    demo[1][0]++;
                    demo[1][1]++;
                    demo[2][1]++;
                }
                if (arr[2][1] == '*') {
                    demo[1][0]++;
                    demo[1][1]++;
                    demo[2][0]++;
                }
            }
            // 0 0
            // 0 0

            // 0
            // 0

            // 0 0
        } else if (x == 1 && y == 1) {
            if (arr[0][0] == '*' || arr[0][0] == '.') {
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;
        } else if (y == 1) {
            for (int i = 0; i < x; i++) {
                if (arr[0][i] == '*') {
                    if (i == 0) {
                        demo[0][i + 1]++;
                    } else if (i == x - 1) {
                        demo[0][i - 1]++;
                    } else {
                        demo[0][i + 1]++;
                        demo[0][i - 1]++;
                    }
                }
            }
        } else if (x == 1) {
            for (int i = 0; i < y; i++) {
                if (arr[i][0] == '*') {
                    if (i == 0) {
                        demo[i + 1][0]++;
                    } else if (i == y - 1) {
                        demo[i - 1][0]++;
                    } else {
                        demo[i + 1][0]++;
                        demo[i - 1][0]++;
                    }
                }
            }
        } else if (x <= 2 && y <= 2) {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (arr[i][j] == '*') {

                        for (int k = 0; k < y; k++) {
                            for (int l = 0; l < x; l++) {
                                if (k == i && l == j) {
                                    continue;
                                } else {
                                    demo[k][l]++;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            // 3x3 and above
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (arr[i][j] == '*') {
                        if (i == 0) {
                            if (j == 0) {
                                demo[i][j + 1]++;
                                demo[i + 1][j]++;

                                demo[i + 1][j + 1]++;
                            } else if (j == y - 1) {
                                demo[i][j - 1]++;
                                demo[i + 1][j]++;

                                demo[i + 1][j - 1]++;
                            } else {
                                demo[i][j - 1]++;
                                demo[i][j + 1]++;
                                demo[i + 1][j]++;

                                demo[i + 1][j - 1]++;
                                demo[i + 1][j + 1]++;
                            }
                        } else if (i == y - 1) {
                            if (j == 0) {
                                demo[i - 1][j]++;
                                demo[i][j + 1]++;

                                demo[i - 1][j + 1]++;
                            } else if (j == x - 1) {
                                demo[i - 1][j]++;
                                demo[i][j - 1]++;

                                demo[i - 1][j - 1]++;
                            } else {
                                demo[i][j - 1]++;
                                demo[i][j + 1]++;
                                demo[i - 1][j]++;

                                demo[i - 1][j - 1]++;
                                demo[i - 1][j + 1]++;
                            }
                        } else if (j == 0) {
                            demo[i - 1][j]++;
                            demo[i + 1][j]++;
                            demo[i][j + 1]++;

                            demo[i + 1][j + 1]++;
                            demo[i - 1][j + 1]++;
                        } else if (j == x - 1) {
                            demo[i - 1][j]++;
                            demo[i + 1][j]++;
                            demo[i][j - 1]++;

                            demo[i - 1][j - 1]++;
                            demo[i + 1][j - 1]++;
                        } else {
                            demo[i - 1][j]++;
                            demo[i + 1][j]++;
                            demo[i][j + 1]++;
                            demo[i][j - 1]++;

                            demo[i + 1][j + 1]++;
                            demo[i + 1][j - 1]++;
                            demo[i - 1][j + 1]++;
                            demo[i - 1][j - 1]++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (demo[i][j] >= 100) {
                    if (arr[i][j] == '*') {
                        continue;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                } else if (demo[i][j] == 0) {
                    if (arr[i][j] == '.') {
                        continue;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    if (String.valueOf(demo[i][j]).equals(String.valueOf(arr[i][j]))) {
                        continue;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }

        System.out.println("YES");
    }
}
