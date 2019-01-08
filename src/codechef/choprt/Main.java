package codechef.choprt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine()); // number of test cases

        while (t > 0) {
            String[] input = bf.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a > b) {
                bw.write(">\n");
            } else if (a < b) {
                bw.write("<\n");
            } else {
                bw.write("=\n");
            }
            bw.flush();

            t--;
        }
    }
}
