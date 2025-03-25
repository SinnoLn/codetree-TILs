import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        int[] record = new int[10001];
        int maxP = -1;
        int minP = 100000;
        for(int i=0; i<n; i++){
            String[] line = br.readLine().split(" ");
            int p = Integer.parseInt(line[0]);
            char c = line[1].charAt(0);
            minP = Math.min(minP, p);
            maxP = Math.max(maxP, p);

            if(c == 'G') record[p] = 1;
            else record[p] = 2;
        }

        int ans = -1;
        for(int i = minP; i<maxP+1; i++){
            int tmp = 0;
            for(int j = i; j < i+k+1; j++){
                tmp+=record[j];
            }
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}