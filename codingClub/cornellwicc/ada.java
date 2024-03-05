import java.util.Scanner;

public class ada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int currSkill = scan.nextInt();
        int days = scan.nextInt(); // days for one level up in currSkill

        int progress = 0;
        int currDay = 0;
        int dayslevel = 0;
        while (progress < n) {
            if (dayslevel == days) {
                currSkill++;
                dayslevel = 0;
            }
            progress += currSkill;
            currDay += 1;
            dayslevel++;
        }
        System.out.println(currDay);

    }
}
