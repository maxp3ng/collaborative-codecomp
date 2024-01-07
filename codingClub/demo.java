// Generic USACO java template
// for comps 2020 and below, where input comes from file instead of terminal

// all imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class demo {
    //           you need this part to your psvm vv
    public static void main(String[] args) throws IOException {

        // reads input file                                        file name vv
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));

        // prints output in file                file name vv
        PrintWriter out = new PrintWriter("billboard.out");
        StringTokenizer st = new StringTokenizer(br.readLine());


        // reads the next number in input
        int n = Integer.parseInt(st.nextToken());

        // reads entire line (for strings)
        String str = br.readLine();


        // prints parameter in file
        out.println(n);


        // this line is always neccessary at the end of your program when
        // everything is done printing
        out.close();
    }

}
