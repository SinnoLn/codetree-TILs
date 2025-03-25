import java.util.*;
import java.io.*;

//같은 위치에 여러 바구니
//최대 100개의 바구니
//바구니 위치는 0부터 100
//k가 조금 애매함
//사탕의 개수 바구니의 좌표
//누가봐도 완전탐색
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] candy = new int[101];
        for(int i=0; i<n; i++){
            input = br.readLine().split(" ");
            int num = Integer.parseInt(input[0]);
            int position = Integer.parseInt(input[1]);

            candy[position]+=num;
        }

        int ans = 0;
        for(int c = k; c<101; c++){
            int tmp = 0;
            for(int j=c-k; j<c+k+1; j++){
                if(j > 100) break;
                tmp+=candy[j];
            }
            ans = Math.max(tmp, ans);
        }
        System.out.println(ans);
    }
}