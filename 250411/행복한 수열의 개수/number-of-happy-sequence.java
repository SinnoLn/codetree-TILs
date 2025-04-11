import java.util.*;
import java.io.*;

//연속하여 m개 이상의 동일한 구간이 존재하는 수열
//n*n
//수열은 총 2n개, 행, 열
//m개 이상 동일하기만 하면 됨
public class Main {
    public static int M;
    public static int N;
    public static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        int ans = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //각 행에 대한 행복한 수열
        for(int i=0; i<N; i++){
            int cnt = 1;
            int tmp = 0;
            for(int j=1; j<N; j++){
                if(arr[i][j-1] == arr[i][j]) cnt++;
                else {
                    tmp = Math.max(tmp, cnt);
                    cnt = 1;
                }
            }
            tmp = Math.max(tmp, cnt);
            if(tmp >= M) ans++;
        }

        //각 열에 대한 행복한 수열
        for(int i=0; i<N; i++){
            int cnt = 1;
            int tmp = 0;
            for(int j=1; j<N; j++){
                if(arr[j-1][i] == arr[j][i]) cnt++;
                else {
                    tmp = Math.max(tmp, cnt);
                    cnt = 1;
                }
            }
            tmp = Math.max(tmp, cnt);
            if(tmp >= M) ans++;
        }

        System.out.println(ans);
    }
}
