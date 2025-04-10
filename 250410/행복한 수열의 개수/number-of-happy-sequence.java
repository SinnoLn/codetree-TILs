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

        for(int i=0; i<N; i++){
            int cnt = 1;
            for(int j=i+1; j<N; j++){
                if(arr[i][j-1] == arr[i][j]) cnt++;
            }
            if(cnt >= M) ans++;
        }

        for(int i=0; i<N; i++){
            int cnt = 1;
            for(int j=i+1; j<N; j++){
                if(arr[j-1][i] == arr[j][i]) cnt++;
            }
            if(cnt >= M) ans++;
        }

        System.out.println(ans);
    }
}