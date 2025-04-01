import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] moves = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            moves[i][0] = Integer.parseInt(line[0]) - 1;
            moves[i][1] = Integer.parseInt(line[1]) - 1;
            moves[i][2] = Integer.parseInt(line[2]) - 1; 
        }

        int ans = 0;

        for (int start = 0; start < 3; start++) {
            int[] cups = new int[3];
            cups[start] = 1;
            int point = 0;

            for (int i = 0; i < n; i++) {
                int a = moves[i][0];
                int b = moves[i][1];
                int c = moves[i][2];

                int tmp = cups[a];
                cups[a] = cups[b];
                cups[b] = tmp;

                if (cups[c] == 1) point++;
            }

            ans = Math.max(ans, point);
        }

        System.out.println(ans);
    }
}