package codechef.luckfour;

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
            int num = Integer.parseInt(bf.readLine());
            int count = 0;
            while (num > 0) {
                if (num % 10 == 4) count++;
                num = num / 10;
            }
            bw.write(count + "\n");
            bw.flush();
            t--;
        }
    }
}
