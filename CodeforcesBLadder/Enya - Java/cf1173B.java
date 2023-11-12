import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cf1173B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // APPROACH: check every pair of 1 through n. Because 1 to n will hold the smallest to greatest difference in numbers,
        // we can assume that if all the pairs of 1 through n are valid, all other pairs will be valid aswell (since the difference
        // will always be smaller). 
        
        int n = scan.nextInt();

        // edge case, could be avoided if currNum starts at 1 but im lazy
        if (n == 1) {
            System.out.println(1);
            System.out.println(1 + " " + 1);
            return;
        }

        // starts at 2 
        int currSize = 2;

        // this loop increments the size of the board
        while (true) {
            // checks if the current area of the area of board can even hold the total amount of pieces
            // so it doesn't have to go through the entire loop process
            if (currSize * 2 < n) {
                currSize++;
            } else {

                // starts at x value 1 and y value 1, could start from x value 2 and y value 1 instead since we start from 2,
                // but it makes like no difference anyways it's ok
                int x = 1;
                int y = 1;
                int currNum = 2;
                boolean found = false;

                // will hold our x and y values for printing later
                // it's declared here so if the currentSize needs to be increased, all the positions reset.
                List<Integer> listX = new ArrayList<>();
                List<Integer> listY = new ArrayList<>();

                // Iterates through all the pieces of the board with all the possible positions with the board's current size.
                // We know we can increment the pieces one by one because the largest number piece must be the furthest from
                // piece 1 (so it can be considered valid by the equation). 
                // Because of that, we will be going through the board the way you would iterate a 2d array
                // (ex: [0,0] -> [0,1] -> [1,0] -> [1,1])
                // in my example i do this process by keeping track of variables over using an actual 2d array 
                // because of personal preference.
                while (!found) {

                    // increases y value when x position is over the current size
                    // (supposed to represent going onto the next row)
                    if (x > currSize) {
                        x = 1;
                        y++;
                    }

                    // declares that the current size board is invalid and breaks loop
                    // when y position is over the current size
                    if (y > currSize) {
                        break;
                    }


                    // checks if 1 and currNum is a valid pairing based currNum's positioning.
                    // 1 will always have positions x = 1 and y = 1.
                    // if valid, the currentNum increases.
                    // increases x value always
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

                // if board is valid, answer gets printed out and program ends
                // else, current size of board is increased and the searching-for-positions process repeats.
                if (found) {
                    // prints out position of 1 first (since my loop starts from 2nd piece
                    // refferring to line 37 currNum = 2).
                    
                    System.out.println(currSize);
                    System.out.println(1 + " " + 1);

                    // prints out the positions of all the other positions 
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
