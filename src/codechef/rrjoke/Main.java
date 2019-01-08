package codechef.rrjoke;

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
            int n = Integer.parseInt(bf.readLine());
            int output = 1;
            for (int i = 0; i < n; i++){
                bf.readLine();
            }
            for (int i = 2; i <= n; i++) {
                output ^= i;
            }
            bw.write(output + "\n");
            bw.flush();
            t--;
        }
    }
}
