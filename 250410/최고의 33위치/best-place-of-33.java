import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int sum = 0;
                for(int dx = 0; dx<3; dx++){
                    for(int dy = 0; dy<3; dy++){
                        sum+=arr[dx+i][dy+j];
                    }
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}