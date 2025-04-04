import java.util.*;
import java.io.*;

public class Main {
    public static int work[][];
    public static int n, ans;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        work = new int[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            work[i][0] = Integer.parseInt(st.nextToken());
            work[i][1] = Integer.parseInt(st.nextToken());
        }
        DFS(0,0);
        System.out.println(ans);
    }
    public static void DFS(int currDay, int currMoney){
        if(currDay>=n){
            ans = Math.max(ans, currMoney);
            return;
        }

        int nextDay = currDay + work[currDay][0];
        //그날 외주를 할 경우
        if(nextDay <= n){
            DFS(nextDay, currMoney+work[currDay][1]);
        }
        //안할 경우
        DFS(currDay+1, currMoney);
    }

}