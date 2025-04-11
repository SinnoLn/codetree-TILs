import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(Systm.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt();
        int m = Integer.parseInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //먼저 기역 블록 계산
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int y = i; y<i+2; y++){
                    int sum = 0;
                    for(int x=j; x<j+2; x++){
                        sum+=arr[y][x];
                    }
                    ans = Math.max(ans, sum-arr[y][x]);
                    ans = Math.max(ans, sum-arr[y][x]);
                    ans = Math.max(ans, sum-arr[y][x]);
                }
            }
        }
    }
}