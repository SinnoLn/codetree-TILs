import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //먼저 기역 블록 계산
        int ans = 0;
        for (int i = 0; (i + 1) < n; i++) {
            for (int j = 0; (j + 1) < m; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];

                // 기역자 블록 (2x2에서 한 칸 제거) → 4가지
                ans = Math.max(ans, sum - arr[i][j]);
                ans = Math.max(ans, sum - arr[i][j+1]); 
                ans = Math.max(ans, sum - arr[i+1][j]);
                ans = Math.max(ans, sum - arr[i+1][j+1]);
            }       
        }


        //일자 블록도 계산
        //행으로 그리고 열로
        for(int i=0; i<n; i++){
            for(int j=0; (j+2)<m; j++){
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                ans = Math.max(ans, sum);
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; (j+2)<n; j++){
                int sum = arr[j][i] + arr[j+1][i] + arr[j+2][i];
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}